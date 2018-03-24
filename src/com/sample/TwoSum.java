package com.sample;

import java.util.Arrays;


class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    if (nums.length < 1)
      return new int[]{-1, -1};

    for (int i=0; i<=nums.length-2; i++) {
      for (int j=i+1; j<=nums.length-1; j++) {
        System.out.println("numbers:"+ nums[i] + ", " + nums[j]);
        if (nums[i] + nums[j] == target) {
          System.out.println("result:"+ nums[i] + ", " + nums[j]);
          int[] r = new int[]{i,j};
          System.out.println(Arrays.toString(r));
          return r;
        }
      }
    }
    return new int[]{-1, -1};
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    twoSum(new int[]{3, 1,7,9,2,78,90}, 5);
  }
}
