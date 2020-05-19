package arrays.search.containsduplicate;

/**
 * Added a second loop, removed hashmap, and improved performance on small data sets.
 *
 * @author hfryling
 */

public class Solution2 {
  public boolean checkIfExist(int[] arr) {
    for(int i = 0; i<arr.length; i++){
      for(int j = arr.length-1; j>i; j--){
        if((arr[i] == arr[j]*2) || (arr[j] / 2 == arr[i]  && arr[j] % 2 == 0)){
          return true;
        }
      }
    }
    return false;
  }

}
