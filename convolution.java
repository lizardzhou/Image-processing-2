package convolution;
import java.util.*;

public class convolution {
	public static Integer[] calcConv(Integer[] fun, Integer[] mask) {
		Integer[] result = new Integer[fun.length + mask.length - 1];
		int sum;
		int index;
		for (int i=0; i<result.length; i++) {
			sum = 0;
			for (int j=0; j<fun.length; j++) {
				index = i - j;
				if (index>=0 && index<mask.length) {
					sum += mask[index] * fun[j];
				} 
			result[i] = sum;	
			}			
		}		
		return result;
			}
	
	public static void main(String[] args) {	
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Function: ");
		nameList.add("Mask: ");
		nameList.add("Result: ");
		
		Integer[] fun = new Integer[4];
		Integer[] mask = new Integer[2];				
		for (int i=0; i<fun.length; i++) {	//generate function to be filtered: [1,2,3]
			fun[i] = i + 1;
		}		
		for (int i=0; i<mask.length; i++) {	//generate mask: [1,2]	
			mask[i] = i + 1;
		}
		Integer[] result = calcConv(fun,mask);	//calculate the convolution fun*mask, with mask zero padded
		
		ArrayList<Integer[]> vectorList = new ArrayList<Integer[]>();
		vectorList.add(fun);
		vectorList.add(mask);
		vectorList.add(result);	
		
		for (int i=0; i<vectorList.size(); i++) {
			System.out.print(nameList.get(i));
			for (int j=0; j<vectorList.get(i).length; j++) {
				System.out.print(vectorList.get(i)[j] + " ");
			}
			System.out.println();
		}
		
		/*
		for (int i=0; i<fun.length; i++) {
			System.out.print(fun[i] + " ");
		}
		System.out.println();
		System.out.print("Mask: ");
		for (int i=0; i<mask.length; i++) {
			System.out.print(mask[i] + " ");
		}
		System.out.println();			
		System.out.print("Result: ");
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		*/
	}

}
