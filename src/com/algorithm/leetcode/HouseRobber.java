package com.algorithm.leetcode;


public class HouseRobber {

	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int even = 0;
		int odd = 0;
	
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				even += nums[i];
				even = even > odd ? even : odd; 
			} else {
				odd += nums[i];
				odd = even > odd ? even : odd;
			}
		}

		return even > odd ? even : odd;
	}

	public static void main(String[] args) {
		HouseRobber houseRobber = new HouseRobber();
		int rob = houseRobber.rob(new int[] {2, 1, 1, 2});
		System.out.println(rob);
	}
}
