package operatori.conditionali;

public class Conditionali {
  
  public static void main(String[] args) {
    int x = 5;
    boolean b1 = true || x < 0; // operandul x<0 nu este evaluat
    System.out.println("b1 = " + b1); // afiseaza true
    
    boolean b2 = false && x < 0; // operandul x<0 nu este evaluat
    System.out.println("b2 = " + b2); // afiseaza false
  }
}
