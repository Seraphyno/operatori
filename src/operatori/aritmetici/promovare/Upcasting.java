package operatori.aritmetici.promovare;

//Se mai gaseste si sub forma de 'Widening'
public class Upcasting {
  
  public static void main(String[] args) {
    int i1 = 0, i2 = 116;
    byte b;
//    b = i1 + i2; // compilatorul genereaza eroare
    b = (byte) (i1 + i2); // compileaza, expresia este convertita
  }
}
