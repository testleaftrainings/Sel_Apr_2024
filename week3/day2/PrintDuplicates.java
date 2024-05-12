package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
	public static void main(String[] args) {
		
		int[] nums = {2,4,5,2,3,5,6,4,7,8,1};
		//output=[2,4,5]
		
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if (!add) {
				duplicate.add(nums[i]);
			}
		}
		System.out.println(unique);
		System.out.println(duplicate);

	}
}
