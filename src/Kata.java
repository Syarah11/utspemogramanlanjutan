import java.util.HashMap;
import java.util.Map;
public class Kata {
    

    public static double findUniq(double arr[]) {
      Map<Double, Integer> frequencyMap = new HashMap<>();
      
      for (double num : arr) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
      }
      
      for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() == 1) {
          return entry.getKey();
        }
      }
      return -1;
    }
  public static void main(String [] args) {
    double[] arr1 = {1, 1, 1, 2, 1, 1};
    double[] arr2 = {0, 0, 0.55, 0, 0};
    double[] arr3 = {3, 10, 3, 3, 3};
    
    System.out.println("Angka unik di arr1: " + findUniq(arr1));
    System.out.println("Angka unik di arr2: " + findUniq(arr2));
    System.out.println("Angka unik di arr3: " + findUniq(arr3));
  }
}

