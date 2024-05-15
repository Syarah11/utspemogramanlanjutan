
public class BouncingBall {
    
    public static int bouncingBall(double h, double bounce, double window) {
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
      return -1;
      
    }
    
    int count = 0;
    while (h > window) {
      count++;
      h *= bounce;
      if (h > window) {
        count++;
      }
    }
      return count;
	}
  
  public static void main(String[] args) {
    double h1 = 3.0;
    double bounce1 = 0.66;
    double window1 = 1.55;
    int passes1 = bouncingBall(1, bounce1, window1);
    System.out.println("Bola melewati jendela sebanyak " + passes1 + " kali.");
    double h2 = 3.0;
    double bounce2 = 1.0;
    double window2 = 1.5;
    
    int passes2 = bouncingBall(h2, bounce2, window2);
    System.out.println ("Bola melewati jendela sebanyak "+ passes2 + " kali.");
  }
}

