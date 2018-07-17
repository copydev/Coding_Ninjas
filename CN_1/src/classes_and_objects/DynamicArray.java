package classes_and_objects;

public class DynamicArray {
	private int[] data = new int[5];
	private int nextptr=0;
	
	public void add(int num){
		if(nextptr>= data.length){
			reconstruct();
		}
			data[nextptr] = num;
			nextptr++;
	}
	
	private void reconstruct(){
		int[] temp = data;
		int[] data = new int[temp.length*2];
		for(int i =0;i<temp.length;i++){
			data[i] = temp[i];
		}
	}
	
	public int size(){
		return data.length;
	}
	
	public void set(int index,int value){
		if(index>=nextptr){
			return;
		}
		data[index]=value;
	}
	
	public int get(int index){
		if(index>=nextptr){
			return -1;
		}
		return data[index];
	}
	
//	public void isEmpty(){}
//	public int removeLast(){}
}
