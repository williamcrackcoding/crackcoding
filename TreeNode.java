import java.util.*;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode	parent;
	private int size = 0;
	
	public TreeNode(int d) {
		data = d;
		size = 1;
	}
	
	private void setLeftChild(TreeNode left) {
		this.left = left;
		if (left != null) {
			left.parent = this;
		}
	}
	
	private void setRightChild(TreeNode right) {
		this.right = right;
		if (right != null) {
			right.parent = this;
		}
	}
	
	public void insertInOrder(int d) {
		if (d <= data) {
			if (left == null) {
				setLeftChild(new TreeNode(d));
			} else {
				if (right == null) {
					setRightChild(new TreeNode(d));
				} else {
					right.insertInOrder(d);
				}
			}
			size++;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isBST() {
		if (left != null) {
			if (data < left.data || !left.isBST()) {
				return false;
			}
		}
		
		if (right != null) {
			if (data >= right.data || !right.isBST()) {
				return false;
			}
		}		
		
		return true;
	}
	
}
