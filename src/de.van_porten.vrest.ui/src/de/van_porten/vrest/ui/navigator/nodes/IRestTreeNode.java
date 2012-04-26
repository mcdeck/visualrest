package de.van_porten.vrest.ui.navigator.nodes;

public interface IRestTreeNode {
	Object[] getChildren();
	boolean hasChildren();
	Object getParent();
}
