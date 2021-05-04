package googol;

import java.util.Scanner;

public class BinomialExpansion {
    
    public static void Formula(int A, int X, int n) 
    {          
          int nFact = fact(n); 
  
        for (int i = 0; i < n + 1; i++) { 
            
              double PowerX = Math.pow(X, i);  
              double PowerA = Math.pow(A, n - i);
             int nCr1 = fact(n - i); 
             int nCr2 = fact(i); 

            System.out.print((nFact * PowerA * PowerX)  
                         / (nCr1 * nCr2) + " "); 
        } 
    } 
   
    public static int fact(int n) 
    { 
        int f = 1; 
        for (int i = 2; i <= n; i++) {
            f= f*i; 
        }
        return f; 
    } 
    
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer according to the formula (A+X)^n ");
        System.out.println("For A :");
        int A = sc.nextInt();
        System.out.println("For X :");
        int X = sc.nextInt();
        System.out.println("For n :");
        int n = sc.nextInt();
          
        Formula(A, X, n); 
    } 
    
}
