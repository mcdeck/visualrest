/**
 *
 */
package de.van_porten.vrest.ui.outline;

import java.util.List;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.PageBook;

import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.outline.tree.OutlineTreeEditPartFactory;

/**
 * @author porten
 *
 */
public class DiagramOutlinePage extends ContentOutlinePage implements IPropertyListener {

	protected static final int ID_OUTLINE = 0;

	private ActionRegistry actionRegistry;
	private KeyHandler keyHandler;
	private EditDomain editDomain;
	private SelectionSynchronizer selectionSynchronizer;
	private DiagramEditor diagramEditor;

	private IAction showOutlineAction;

	private PageBook pageBook;
	private Control outline;

	public DiagramOutlinePage( DiagramEditor diagramEditor ) {
		super( new TreeViewer() );

		this.actionRegistry = (ActionRegistry) diagramEditor.getAdapter(ActionRegistry.class);
		this.editDomain = diagramEditor.getEditDomain();
		this.keyHandler = (KeyHandler) diagramEditor.getAdapter(KeyHandler.class);
		this.selectionSynchronizer = (SelectionSynchronizer) diagramEditor.getAdapter(SelectionSynchronizer.class);
		this.diagramEditor = diagramEditor;
	}

	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
		IActionBars actionBars = pageSite.getActionBars();
		registerGlobalActionHandler(actionBars, ActionFactory.UNDO.getId());
		registerGlobalActionHandler(actionBars, ActionFactory.REDO.getId());
		registerGlobalActionHandler(actionBars, ActionFactory.COPY.getId());
		registerGlobalActionHandler(actionBars, ActionFactory.PASTE.getId());
		registerGlobalActionHandler(actionBars, ActionFactory.PRINT.getId());
		registerGlobalActionHandler(actionBars, ActionFactory.SAVE_AS.getId());
		actionBars.updateActionBars();
	}

	public void initContents() {
		EditPartFactory treeEditPartFactory = new OutlineTreeEditPartFactory();
		getViewer().setEditPartFactory(treeEditPartFactory);
		Diagram diagram = diagramEditor.getDiagramTypeProvider().getDiagram();
		getViewer().setContents(diagram);
	}

	@Override
	public void createControl(Composite parent) {
		pageBook = new PageBook(parent, SWT.NONE);
		outline = getViewer().createControl(pageBook);
		//overview = new Canvas(pageBook, SWT.NONE);
		pageBook.showPage(outline);
		createOutlineViewer();

		// register listeners
		selectionSynchronizer.addViewer(getViewer());
		diagramEditor.addPropertyListener(this);

		initContents();
	}

	@Override
	public Control getControl() {
		return pageBook;
	}

	protected void createOutlineViewer() {
		// set the standard handlers
		getViewer().setEditDomain(editDomain);
		getViewer().setKeyHandler(keyHandler);

		// add a context-menu
		ContextMenuProvider contextMenuProvider = createContextMenuProvider();
		if (contextMenuProvider != null)
			getViewer().setContextMenu(contextMenuProvider);

		// add buttons outline/overview to toolbar
		IToolBarManager tbm = getSite().getActionBars().getToolBarManager();
		showOutlineAction = new Action() {
			@Override
			public void run() {
				showPage(ID_OUTLINE);
			}
		};
		showOutlineAction.setImageDescriptor(GraphitiUi.getImageService().getImageDescriptorForId(RestImageProvider.IMG_MISC_OUTLINE_TREE));
		tbm.add(showOutlineAction);

		// by default show the outline-page
		showPage(ID_OUTLINE);
	}

	protected ContextMenuProvider createContextMenuProvider() {
		return null;
	}

	@Override
	public void dispose() {
		selectionSynchronizer.removeViewer(getViewer());
		diagramEditor.removePropertyListener(this);

		super.dispose();
	}

	@Override
	public void propertyChanged(Object source, int propId) {
		refresh();
	}

	protected void showPage(int id) {
		if (id == ID_OUTLINE) {
			showOutlineAction.setChecked(true);
			pageBook.showPage(outline);
		}
	}

	private void registerGlobalActionHandler(IActionBars actionBars, String id) {
		IAction action = actionRegistry.getAction(id);
		if (action != null)
			actionBars.setGlobalActionHandler(id, action);
	}

	private void refresh() {
		final EditPartViewer viewer = getViewer();
		final EditPart contents = viewer.getContents();
		if (contents != null) {
			contents.refresh();
			List<?> children = contents.getChildren();
			for (Object object : children) {
				if( object instanceof EditPart ) {
					((EditPart) object).refresh();
				}
			}
		}
	}
}
