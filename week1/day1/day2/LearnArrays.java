package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// In Java, the index always starts from 0
		//               0 1   2  3  4
        int[] scores = {98,89,78,92,93};
        //              78,89,92,93,98
        
        //to find the total size of an array
        // to assign a value to a variable -> ctrl+2,l
        int len = scores.length;
        System.out.println("The total size of the array is : "+len);
        
        // to sort an array in ascending order
        Arrays.sort(scores);
        
        // to retrieve a single value from the array
        System.out.println(scores[4]);
        
        // the minimum value / least value of this array
        System.out.println("The least value is : "+scores[0]);
        
        // the max value 
        System.out.println("The max value is : " +scores[len-1]);
        
        // to print all values inside the array
        for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]); // scores[4] = 78 89 92 93  98   
		}
        
        // to print all values inside the array in reverse
        for (int i = scores.length-1; i >=0; i--) {
			System.out.println(scores[i]); // scores[4] = 78 89 92 93  98   
		}
        
	}

}
