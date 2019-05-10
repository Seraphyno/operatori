package operatori.aritmetici.atribuire;

public class Atribuire {
  
  public static void main(String[] args) {
    int i = 0; // i este declarat si initializat
    i = i + 1; // + are o ordine de precenta mai ridicata -> i = 2
    
    int k = 2, j = 5;
    k = k + j; // operator de atribuire simplu
    System.out.println("valoare obtinuta cu op de atribuire simplu = " + k);
    k = 2;
    j = 5;
    k += j; // operator de atribuire compus
    System.out.println("valoare obtinuta cu op de atribuire compus = " + k);
    // int l  *= k;
    
  }
}
