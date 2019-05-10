package operatori.logici;

public class Logici {
  
  public static void main(String[] args) {
    int i = 2, j = 1;
    if (i > 0 & ++j >= i) {
      System.out.println("Operator logic AND");
    }
    
    if (i > 0 | j > 0) {
      System.out.println("Operator logic OR inclusiv");
    }
    
    if (i < 0 ^ j > 0) {
      System.out.println("Operator logic OR exclusiv");
    }
  }
}
