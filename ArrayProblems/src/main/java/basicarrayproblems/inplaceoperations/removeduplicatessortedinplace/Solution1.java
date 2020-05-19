package basicarrayproblems.inplaceoperations.removeduplicatessortedinplace;

/**
 * In-place method to remove duplicates from a sorted array.
 *
 * @author hfryling
 */

public class Solution1 {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int length = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i+1] != nums[i]) {
        nums[length] = nums[i + 1];
        length++;
      }
    }
    return length;
  }
}
