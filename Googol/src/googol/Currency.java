package googol;

import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Currency {

    public static void main(String[] args) {
        
        double money,convert;
        String before,after,stat="myr";
        Scanner sc = new Scanner(System.in);
        System.out.print("From what currency : ");
        before=sc.next();
        System.out.print("To what currency : ");
        after=sc.next();
        System.out.print("Please enter the amount of money to convert: ");
        money = sc.nextDouble();
        if(before.equalsIgnoreCase(stat)||after.equalsIgnoreCase(stat)){
            convert=xcg(money,before,after);
            if(convert!=0){
                System.out.printf("The conversion amount is %.2f",convert);
                System.out.println(" "+after.toUpperCase());
            }
            else
            	System.out.println("You enter a wrong conversion unit");
        }
        else{
            
            String x;
            x=after;
            after=stat;
            convert=xcg(money,before,after);
            if(convert==0){
                System.out.println("You enter wrong conversion unit");
            }
            before=stat;
            after=x;
            convert=xcg(convert,before,after);
            if(convert==0){
                
            }
            else{
            	System.out.printf("The conversion amount is %.2f",convert);
            	System.out.println(" "+after.toUpperCase());
            }
        }
    }
    
    public static double xcg(double a,String b,String c){
        
        double rate,x;
        rate=perc(b,c);
        if(rate!=0)
            x=a*rate;
        else
            x=0;
        
        return x;
    }
    
    public static double perc(String a,String b){
        
        double y=0;
        try{
            
            Scanner s = new Scanner(new FileInputStream("C://Users/imran/My Project/Googol/currencyData.txt"));
            stop:
            while(s.hasNextLine()){
                if(s.next().equalsIgnoreCase(a)&&s.next().equalsIgnoreCase(b)){
                    y=s.nextDouble();
                    break stop;
                }
                if(s.hasNextLine()==false){
                    y=0;
                    break stop;
                }
            }
            
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        return y;
    }
    
}
