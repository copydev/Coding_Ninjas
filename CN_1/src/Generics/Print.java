package Generics;
import oop_inheritance.Vehicle;

public class Print {
//	public static<T> void printArray(T a[]){
//		for(int i =0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
//		System.out.println();
//	}
	
	public static<T extends PrintInterface> void printArray(T a[]){
		for(int i =0;i<a.length;i++){
			a[i].print();
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Integer[] a ={1,2,3,4,5};
		//printArray(a);
		//Same for String
		
		Vehicle v[] = new Vehicle[10];
		for(int i =0;i<10;i++){
			v[i] = new Vehicle(10);
		}
		printArray(v);
		
		Student[] s = new Student[10];
		for(Student stud :s){
			stud.rollNo = 26;
		}
		
		printArray(s);
		
	}
}
