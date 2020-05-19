package basicarrayproblems.inplaceoperations.movezeroes;

/**
 * Move zeros to the end of an array in place.
 *
 * @author hfryling
 */

public class Solution1 {
  public void moveZeroes(int[] nums) {
    int numZeroes = 0;
    int readPos = 0;
    int writePos = 0;
    while(readPos < nums.length - 1) {
      if (nums[readPos] == 0) {
        nums[writePos] = nums[readPos + 1];
        numZeroes++;
      } else {
        nums[writePos] = nums[readPos];
        writePos++;
      }
      readPos++;
    }
    if (nums[nums.length - 1] != 0) {
      nums[writePos] = nums[nums.length - 1];
      writePos++;
    }
    while(writePos < nums.length) {
      nums[writePos] = 0;
      writePos++;
    }
  }

}
