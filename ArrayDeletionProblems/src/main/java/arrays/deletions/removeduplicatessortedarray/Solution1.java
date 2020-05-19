package arrays.deletions.removeduplicatessortedarray;

/**
 * A method to remove duplicate items from a sorted array.
 *
 * @author hfryling
 */

public class Solution1 {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int length = 1;
    for(int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i-1]) {
        nums[length] = nums[i];
        length++;
      }

    }
    return length;
  }

}
