package linkedList;

 
public class Solution {



	public static Node<Integer> bubbleSort(Node<Integer> head )
	{
		//Write your code here
      Node<Integer> temp = head;
      Node<Integer> temp2 = null;
      Node<Integer> tail = null;
      int count = count(head);
      int ptr = 0;
     for(int i = 0;i<count-1;i++){
    	 temp = head;
    	 for(int j =0;j<count-i-1;j++){
    		 if(temp.data>temp.next.data){
    			head = swap_Nodes(head,temp.data,temp.next.data);
    		 }
    		 else{
    			 temp = temp.next;
    		 }
    	 }
    	 
     }
      return head;
      
	}
	
	public static int count(Node<Integer> head){
		Node<Integer> temp  = head;
		int count = 0;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		return count;
	}
  
  
  	public static  Node<Integer> swap_Nodes(Node<Integer> head,int x,int y){// Nothing to do if x and y are same
        if (x == y) return head;
 
        // Search for x (keep track of prevX and CurrX)
        Node<Integer> prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }
 
        // Search for y (keep track of prevY and currY)
        Node<Integer> prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }
 
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return head;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        Node<Integer> temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
        return head;
        }



}
