package operatori.ternar;

public class Ternar {
  
  public static void main(String[] args) {
    boolean anBisect = false;
    short v29 = 29;
    short v28 = 28;
   
    int zileFebruarie = anBisect //anBisect este expresia de evaluat. identic cu anBisect == true
                        ? v29  //valoare daca expresia intoarce true
                        : v28; //valoare daca expresia intoarce false
   
    System.out.println(zileFebruarie); // afiseaza 28
  }
}
