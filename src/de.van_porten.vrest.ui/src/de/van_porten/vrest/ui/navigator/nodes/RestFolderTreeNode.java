package de.van_porten.vrest.ui.navigator.nodes;

import org.eclipse.emf.common.util.EList;

public class RestFolderTreeNode implements IRestTreeNode, IRestNamedElement  {

	private EList<? extends Object> children;
	private String name;
	private String imagePath;
	private Object parent;

	public RestFolderTreeNode( String name, String imagePath, Object parent, EList<? extends Object> children ) {
		this.name = name;
		this.setChildren(children);
		this.setImagePath(imagePath);
		this.parent = parent;
	}

	public void setChildren(EList<? extends Object> children) {
		this.children = children;
	}

	@Override
	public Object[] getChildren() {
		if( children != null ) {
			return children.toArray();
		} else {
			return new Object[0];
		}
	}

	@Override
	public boolean hasChildren() {
		if( children != null ) {
			return children.size() > 0;
		} else {
			return false;
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public Object getParent() {
		return parent;
	}

}
