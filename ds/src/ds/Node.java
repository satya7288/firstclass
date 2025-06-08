package ds;
class Node {
	int val;
	Node left,right;
	
	Node(int key){
		this.val=val;
		left=right=null;
	}
}
class binarytree{
	Node root;
	
	void buildsampletree() {
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
	}
	
	void inorder(Node node) {
		if(node !=null) {
			inorder(node.left);
			System.out.println(node.val+" ");
			inorder(node.right);
		}
	}
	void preorder(Node node) {
		if(node !=null) {
			System.out.println(node.val+" ");
			inorder(node.left);
			inorder(node.right);
		}
	}
	void postorder(Node node) {
		if(node !=null) {
			inorder(node.left);
			inorder(node.right);
			System.out.println(node.val+" ");
		}
	}
	public static void main(String[] args) {
		binarytree bs=new binarytree();
		bs.buildsampletree();
		System.out.println("inorder:");
		bs.inorder(bs.root);
		System.out.println("preorder:");
		bs.preorder(bs.root);
		System.out.println("postorder:");
		bs.postorder(bs.root);
	}
}