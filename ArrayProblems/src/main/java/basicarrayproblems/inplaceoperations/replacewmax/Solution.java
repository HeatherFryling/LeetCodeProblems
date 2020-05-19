package basicarrayproblems.inplaceoperations.replacewmax;

/**
 * A method to replace the last element in an array with -1 and every subsequent element with the
 * element to its right.
 *
 * The array will contain only positive integers.
 *
 * @author hfryling
 */

class Solution {
  public int[] replaceElements(int[] arr) {
    int maxSoFar = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      int temp = arr[i];
      arr[i] = maxSoFar;
      if (temp > maxSoFar) {
        maxSoFar = temp;
      }
    }
    return arr;

  }
}