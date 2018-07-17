package Generics;

public class PairUse {
	public static void main(String[] args){
		Pair<Integer,String> p = new Pair<>(21,"world");
		Pair p1 = new Pair(1,2);
		
		Pair<Character,Character> p2 = new Pair<>('a','b');
		
		Pair<Integer,Integer> pTemp = new Pair(12,34);
		
		Pair<Integer, Pair<Integer,Integer>> p3 = new Pair<>(36,pTemp); 
		System.out.println(p3.getSecond().getFirst());
	}
}
