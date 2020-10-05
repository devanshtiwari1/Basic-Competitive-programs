package Datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCodePractice {

	public static int[] twoSum(int[] nums, int target) {
		int[] output = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(target - nums[i]) != null) {
				output[0] = map.get(target - nums[i]);
				output[1] = i;
			} else {
				map.put(nums[i], i);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] nums = { 2,7,11,15 };
		 
		System.out.println(twoSum(nums, 9));
		
	}
}
