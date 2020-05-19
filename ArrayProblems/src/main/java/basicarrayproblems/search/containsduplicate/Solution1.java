package arrays.search.containsduplicate;

/**
 * A method to see if an array contains an element that is the double of another array element.
 *
 * @author hfryling
 */

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
  public boolean checkIfExist(int[] arr) {
    Map<Integer, Integer> doubleValues = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int doubled = arr[i] * 2;
      doubleValues.put(arr[i], doubled);
      for (int j = 0; j < i; j++) {
        if (arr[j] == doubleValues.get(arr[i])) {
          return true;
        }
        if (arr[i] % 2 == 0) {
          if (arr[j] == arr[i] / 2) {
            return true;
          }
        }
      }

    }
    return false;
  }
}
