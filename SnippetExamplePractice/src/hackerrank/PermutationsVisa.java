package hackerrank;

import java.util.ArrayList;

public class PermutationsVisa {
	
		int x=1;
		int y=2;
		int permutSize = 5;
		int length;

		public static void main(String args[]){
			PermutationsVisa pd = new PermutationsVisa();
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(0);
			
			pd.printAllPermutations(al);
		}
		
		public void printAllPermutations(ArrayList<Integer> a){
			ArrayList<Integer> a1 = new ArrayList<Integer>(a);
			
			if(a.size() == permutSize){
				System.out.println(a);
			}else{
				a.add(a.get(a.size()-1) + x);
				printAllPermutations(a);
				a1.add(a1.get(a1.size()-1) + y);
				printAllPermutations(a1);
			}
		}
		
		public void printArray(int a[]){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println("");
		}
		
		public static void makePalindrom(String inputStr){
			
		}
}
