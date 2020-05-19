package arrays.deletions.removeelement;

/**
 * Optimized method to remove a given value from an array of ints.
 *
 * This is the same as the first solution given on LeetCode.
 *
 * I removed the shifting and just copied over the unwanted elements.
 *
 * @author hfryling
 */

public class Solution2 {
  public int removeElement(int[] nums, int val) {
    int length = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[length] = nums[i];
        length++;
      }
    }
    return length;
  }

  private void printArr(int[] nums, int length) {
    System.out.println();
    for (int i = 0; i < length; i++) {
      System.out.print(nums[i]);
    }
    System.out.println();
  }
}
