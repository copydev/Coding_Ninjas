package trees;

import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class TreeUse {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		// TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root = takeInputLevelWise();

		printLevelWise(root);

	}

	public static TreeNode<Integer> takeInput(Scanner s) {
		// TODO Auto-generated method stub

		int n;

		System.out.println("Enter next node");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for " + n);
		int childCount = s.nextInt();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;

	}

	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter no. of children of " + frontNode.data);
				int numChildren = s.nextInt();
				for (int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					pendingNodes.enqueue(childNode);
					frontNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
				// Will not occur
				return null;
			}
		}
		return root;

	}

	public static void print(TreeNode<Integer> root) {
		String s = root.data + ": ";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}

	public static void printLevelWise(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		QueueUsingLL<TreeNode<Integer>> abovelevel = new QueueUsingLL<>();
		QueueUsingLL<TreeNode<Integer>> currentlevel = new QueueUsingLL<>();
		abovelevel.enqueue(root);
		pendingNodes.enqueue(root);
		System.out.println(root.data);
		TreeNode<Integer> frontNode;
		
		while (!abovelevel.isEmpty()) {
			while (!abovelevel.isEmpty()) {
				try {
					frontNode = abovelevel.dequeue();
					String s = new String();
					// String s = frontNode.data + ": ";
					for (int i = 0; i < frontNode.children.size(); i++) {
						s = s + frontNode.children.get(i).data + " ";
						currentlevel.enqueue(frontNode.children.get(i));
					}

					if (!s.isEmpty())
						System.out.print(s);
				} catch (QueueEmptyException e) {
					return;
				}

			}
			System.out.println();
			while(!currentlevel.isEmpty()){
				try {
					abovelevel.enqueue(currentlevel.dequeue());
				} catch (QueueEmptyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
	
	public static int numNodes(TreeNode<Integer> root){
		if(root==null){
			return 0;
			//Not a base case
		}
		int count = 1;
		for(int i = 0;i<root.children.size();i++){
			count +=numNodes(root.children.get(i));
		}
		return count;
	}
}
