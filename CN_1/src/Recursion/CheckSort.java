package Recursion;

public class CheckSort {
	
	public static boolean check(int arr[]){
		
		if (arr.length <= 1){
			return true;
		}
		
		int[] smallArr = new int[arr.length-1];
		for(int i = 0; i<smallArr.length;i++){
			smallArr[i] = arr[i+1];
		}
		
		boolean smallAns = check(smallArr);
		if(!smallAns){
			return false;
		}
		
		if(arr[0]<arr[1]){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean check2(int arr[]){
		
		if (arr.length <= 1){
			return true;
		}
		if(arr[0]>arr[1]){
			return false;
		}
		
		int[] smallArr = new int[arr.length-1];
		for(int i = 0; i<smallArr.length;i++){
			smallArr[i] = arr[i+1];
		}
		
		boolean smallAns = check2(smallArr);
//		if(smallAns){
//			return true;
//		}
//		else{
//			return false;
//		}
		
		return smallAns;
		
		
	}

	public static boolean checkBetter(int[] input, int start){
		if(start == input.length-1){
			return true;
		}
		
		if(input[start]>input[start + 1]){
			return false;
		}
		
		boolean smallAns = checkBetter(input , start + 1);
//		if(!smallAns){
//			return false;
//		}
//		else
//			return true;
		return smallAns;
	}
	
	public static void main(String[] args){
			
			int[] input  = {1 ,3, 5 ,9 , 8};
			System.out.print(checkBetter(input,0));
			}
}
