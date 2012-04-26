package de.van_porten.vrest.ui.properties;

import java.beans.PropertyChangeEvent;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.van_porten.vrest.core.model.restbehavior.ReturnAction;

public class ReturnActionPropertySection extends GFPropertySection implements
		ITabbedPropertyConstants {

	private Text nameText;

	 private ModifyListener statusCodeListener = new ModifyListener() {
         public void modifyText(ModifyEvent arg0) {
             TransactionalEditingDomain editingDomain = getDiagramEditor().getEditingDomain();
             editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
                 @Override
                 protected void doExecute() {
                     changePropertyValue();
                 }
             });
         }
     };

     private void changePropertyValue() {
    	PictogramElement pe = getSelectedPictogramElement();
 		if (pe instanceof ConnectionDecorator) {
 			pe = ((ConnectionDecorator) pe).getConnection();
 		}
 		if (pe != null) {
 			final Object bo = Graphiti.getLinkService()
 					.getBusinessObjectForLinkedPictogramElement(pe);
 			if (bo instanceof ReturnAction) {
 				if (bo instanceof ReturnAction) {
	 				try {
	                    int number = Integer.parseInt(nameText.getText());
	                    ((ReturnAction) bo).getStatus().setNumber(number);
	                } catch(Exception e) {
	                	System.out.println(e.getMessage());
	                }
 				}
 			}
 		}
     }

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		FormData data;

		nameText = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, VSPACE);
		nameText.setLayoutData(data);
		nameText.addModifyListener(statusCodeListener);

		// better use focus listener here?
		//nameText.addFocusListener(null);
		nameText.addVerifyListener(new VerifyListener() {

			@Override
			public void verifyText(VerifyEvent e) {
				// TODO Auto-generated method stub
				// Maybe this will help in catching invalid input?
			}
		});

		CLabel valueLabel = factory.createCLabel(composite, "Status Code:");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(nameText, -HSPACE);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		valueLabel.setLayoutData(data);
	}

	@Override
	public void refresh() {
		nameText.removeModifyListener(statusCodeListener);

		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(pe);
			// the filter assured, that it is a EClass
			if (bo == null)
				return;
			String name = String.valueOf(((ReturnAction) bo).getStatus()
					.getNumber());
			nameText.setText(name == null ? "" : name);
		}

		nameText.addModifyListener(statusCodeListener);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		super.propertyChange(evt);
	}

/*
	private void runModelChange(final Runnable runnable,
			final TransactionalEditingDomain editingDomain, final String label) {
		editingDomain.getCommandStack().execute(
				new RecordingCommand(editingDomain, label) {
					protected void doExecute() {
						runnable.run();
					}
				});
	}
*/
}
