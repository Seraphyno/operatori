package operatori.binari;

public class Binari {
  
  public static void main(String[] args) {
    //Presupunem ca avem un a = 60 si un b = 13
    // in sistem binar obtinem:
    
    int a = 60;                           /* 60 = 0011 1100 */
    int b = 13;                           /* 13 = 0000 1101 */
    int c = 0;
    c = a & b;                            /* 12 = 0000 1100 */
    System.out.println("a & b = " + c);
    
    c = a | b;                            /* 61 = 0011 1101 */
    System.out.println("a | b = " + c);
    
    c = a ^ b;                            /* 49 = 0011 0001 */
    System.out.println("a ^ b = " + c);
    
    //Binary Ones Complement Operator is unary and has the effect of 'flipping' bits
    c = ~a;                               /*-61 = 1100 0011 */
    System.out.println("~a = " + c);
    
    //Binary Left Shift Operator.
    // The left operands value is moved left by the number of bits specified by the right operand.
    c = a << 2;                           /* 240 = 1111 0000 */
    System.out.println("a << 2 = " + c);
    
    //Binary Right Shift Operator.
    // The left operands value is moved right by the number of bits specified by the right operand.
    c = a >> 2;                           /* 15 = 1111 */
    System.out.println("a >> 2  = " + c);
    
    //Shift right zero fill operator.
    // The left operands value is moved right by the number of bits specified by the right operand
    // and shifted values are filled up with zeros.
    c = a >>> 2;                          /* 15 = 0000 1111 */
    System.out.println("a >>> 2 = " + c);
  }
}
