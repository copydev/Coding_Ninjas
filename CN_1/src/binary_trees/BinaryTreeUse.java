package binary_trees;

import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class BinaryTreeUse {
	
	public static void printTree(BinaryTreeNode<Integer> root){
		if(root ==null){
			return;
		}
		String toBePrinted = root.data + " ";
		if(root.left != null){
			toBePrinted += "L:" + root.left.data +",";
		}
		
		if(root.right != null){
			toBePrinted += "R:" + root.right.data+ ",";
		}
		
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		int rootData;
		System.out.println("Enter root data");
		rootData= s.nextInt();
		if(rootData==-1){
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		
		return root;
		
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("enter root data");
		int rootData= s.nextInt();
		if(rootData==-1){
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> front = null;
			try {
				 front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			
			System.out.println("Enter leftChild of "+ front.data);
			int leftChild = s.nextInt();
			if(leftChild!=-1){
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(left);
				front.left = left;
			}
			System.out.println("Enter rightChild of " + front.data);
			int rightChild = s.nextInt();
			if(rightChild!=-1){
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(right);
				front.right = right;
			}
			
		}
		return root;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printTree(root);
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
//		root.left= node1;
//		root.right = node2;
		
		System.out.println("");
	}
}
