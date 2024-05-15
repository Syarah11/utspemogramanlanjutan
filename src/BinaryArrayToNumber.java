import java.util.List;
public class BinaryArrayToNumber {
    
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      int Desimal = 0;
      for (int bit : binary) {
        Desimal = (Desimal << 1) | bit;
        
      }
      
      return Desimal;
         
    }
  
  public static void main(String [] args){
    List<Integer> arrayBiner = List.of(0, 0, 1, 0);
    int nilaiDesimal = ConvertBinaryArrayToInt(arrayBiner);
    System.out.println("Nilai Desimal: " + nilaiDesimal);
  }
}

