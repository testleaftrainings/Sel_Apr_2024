package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		int[] nums = {2,4,5,2,3,5,6,4,7,8,1};
		// output=[2,4,5,3,6,7,8,1] ->insertion order
		
		// declare Set
		Set<Integer> unique = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);
		}
		System.out.println(unique);

	}
}
