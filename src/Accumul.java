
public class Accumul {
    
    public static void main(String [] args) {
      System.out.println(accum("abcd"));
      System.out.println(accum("RqaEzty"));
      System.out.println(accum("cwAt"));
    }
  
  public static String accum(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      result.append(Character.toUpperCase(c));
      for (int j = 0; j < i; j++) {
        result.append(Character.toLowerCase(c));
      }
      if (i < s.length() - 1) {
        result.append("-");
      }
    }
    return result.toString();
  }
  
}

