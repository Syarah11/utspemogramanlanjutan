import java.util.ArrayList;
import java.util.List;
public class Kata1 {
    


  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> result = new ArrayList<>();
    
    for (int num : a) {
      boolean found = false;
      for (int check : b){
        if (num == check) {
          found = true;
          break;
          
        }
      }
      if (!found) {
        result.add(num);
        
      }
    }
    
    int [] diffArray = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      diffArray[i] = result.get(i);
      
    }
    return diffArray;
  }
  
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 2, 2, 3};
    int[] arr2 = {2};
    int[] diff = arrayDiff(arr1, arr2);
    System.out.print("Hasil array diff: ");
    for (int num : diff) {
      System.out.print(num + " ");
    }
  }

}
}
