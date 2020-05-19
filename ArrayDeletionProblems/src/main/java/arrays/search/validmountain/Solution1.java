package arrays.search.validmountain;

/**
 * A method to determine if an array is a valid mountain array.
 *
 * @author hfryling
 */

class Solution1 {
  public boolean validMountainArray(int[] A) {
    if (A.length < 3) {
      return false;
    }

    if (!(A[A.length-1] < A[A.length - 2]) || !(A[0] < A[1])) {
      return false;
    }

    int maxPos = this.findMaxPos(A);
    for (int i = 0; i < maxPos; i++) {
      if (A[i] >= A[i + 1]) {
        return false;
      }
    }

    for (int j = A.length - 1; j > maxPos; j--) {
      if (A[j] >= A[j-1]) {
        return false;
      }
    }

    return true;
  }

  private int findMaxPos(int[] A) {
    int max = A[0];
    int maxPos = 0;
    for (int i = 1; i < A.length; i++) {
      if (A[i] > max) {
        max = A[i];
        maxPos = i;
      }
    }
    return maxPos;
  }
}
