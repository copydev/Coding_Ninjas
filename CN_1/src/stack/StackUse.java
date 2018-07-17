package stack;

public class StackUse {
	public static void main(String[] args) throws StackEmptyException,StackFullException {
			StackUsingArray stack = new StackUsingArray(3);
			for(int i =1;i<6;i++){
				stack.push(i);
			}
			
			while(!stack.isEmpty()){
				try{
				System.out.println(stack.pop());
				}
				catch(StackEmptyException e){
					// never reach here
				}
			}
	}

}
