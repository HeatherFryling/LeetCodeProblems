package arrays.deletions.removeelement;

/**
 * A method to remove a given value from an array of ints.
 *
 * @author hfryling
 */

public class Solution1 {
  public int removeElement(int[] nums, int val) {
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (nums[i] == val) {
        this.shiftLeft(nums, i, length);
        length--;
        i--;
      }
    }
    return length;
  }

  private void shiftLeft(int[] nums, int pos, int length) {
    for (int i = pos; i < length - 1; i++) {
      nums[i] = nums[i + 1];
    }
  }

  private void printArr(int[] nums, int length) {
    System.out.println();
    for (int i = 0; i < length; i++) {
      System.out.print(nums[i]);
    }
    System.out.println();
  }

}
