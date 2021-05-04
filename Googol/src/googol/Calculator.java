package googol;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    
    

   
    public static double Operation(String strinput) {
        double ans = 0;
        ArrayList<Double> number = new ArrayList<>();
        ArrayList<Integer> operand = new ArrayList<>();
        double num = 0;

        char x = ' ';

        for (int i = 0; i < strinput.length(); i++) {
           num=0;
            x = strinput.charAt(i);

            
            
        if(Character.isDigit(x)){
            while(Character.isDigit(x)) {
                //in asci
                int digit = x - '0';
                num=num*10+ digit;
                
                if (i==strinput.length()-1){
                    i++;
                    break;
                }//to add counter
                if(i<strinput.length()-1){
                    x=strinput.charAt(++i);
                    
               }
              
            } number.add(num);
// to complement the original for loop
          i--;
        }
        
        else if(x == '+' || x == '-' || x == '*' || x == '/'){
            
                if (x=='+')   
                     operand.add(0);
                    
                else if(x=='-')
                     operand.add(1);
                     
                else if(x=='*')
                     operand.add(2);
                     
                else if(x=='/')
                     operand.add(3);  
                    
     
        }
     } 
        //for(operations)
        //remove is to remove the used number and operand 
       int a=0;
      while(a<operand.size()){
         
          if(operand.get(a)==2){
              
              number.set(a,number.get(a)*number.get(a+1));
              number.remove(a+1);
              operand.remove(a);
              a=0;
              
          }else if(operand.get(a)==3){
              number.set(a,number.get(a)/number.get(a+1));
              number.remove(a+1);
              operand.remove(a);
              a=0;
          }else{
              a++;
          }
      }
      
       int b=0;
      while(b<operand.size()){
          if(operand.get(b)==0){
              
              number.set(b,number.get(b)+number.get(b+1));
              number.remove(b+1);
              operand.remove(b);
              b=0;
              
          }else if(operand.get(b)==1){
               number.set(b,number.get(b)-number.get(b+1));
              number.remove(b+1);
              operand.remove(b);
              b=0;
          }
      }
      //last ans at index 0
      ans = number.get(0);
      return ans;
   }


    
 public static void main(String[] args) {
     System.out.println("Welcome to googal calculator!!! ");
     System.out.println("-type exit to stop-");
        Scanner sc = new Scanner(System.in);
        String strinput;
        
        while(true) {
            System.out.println("Enter the calculation: ");
            
            strinput = sc.next();

        
            if (!strinput.equals("exit")) {
                double ans = Operation(strinput);
                System.out.println("Answer is: " + ans);
               
             
            }
            else {
                System.out.println("Thanks for using googal calculator..");
                System.out.println("See you again");
                break;
            }
          
        }
   }    
    
}
