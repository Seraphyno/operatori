package operatori.aritmetici.promovare;

//se mai gaseste si sub forma de Narrowwing
public class Downcasting {
  
  public static void main(String[] argv) {
    char ch = 'c';
    Character c = ch;
    c.charValue();
    int num = 88;
    //ch = num; // nu compileaza, tipuri incompatibile
    ch = (char) num; //Solutia
    
    //acest exemplu functioneaza deoarece orice caracter poate fi reprezentat si
    //prin o valoare: caracterul 'e' are in ASCII valoarea '\u0065'
    //https://www.rapidtables.com/code/text/unicode-characters.html
  }
}
