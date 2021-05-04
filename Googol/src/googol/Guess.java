package googol;

import java.util.Random;
import java.util.Scanner;

public class Guess{

	Random r = new Random();
	Scanner sc = new Scanner(System.in); 
	int computer;
	String user;
	String winner;
	String numToWord = "";

public static void main(String[] args) {
    Random r = new Random();
    Scanner sc = new Scanner(System.in); 
    int computer1;
    String user;
    String winner;
    String numToWord = "";


    String exit = "";

    while(!exit.equalsIgnoreCase("yes")) {
    	computer1 = r.nextInt(1001);
    	System.out.println("Guess the number from 0-1000");
    	user=sc.nextLine();
    	convert();
    	if (user.equalsIgnoreCase(numToWord))
    		System.out.println("It's a Correct Guess");
    	else
    		System.out.println("It's a Wrong Guess");
    	System.out.println("exit=yes/no");
    	exit=sc.nextLine();
    
    }
}
    
public static void convert() {
    Random r = new Random();
    Scanner sc = new Scanner(System.in); 
    int computer1=r.nextInt(1001);;
    String user;
    String winner;
    String numToWord = "";

    System.out.println("The computer generated "+computer1);
    String z = "";
    String q= "";
    String j = "";
    if(computer1<100) {
    	//System.out.println(tens[computer/10] + " " + ones[computer%10]);
    	numToWord += tens[computer1/10] + " " + ones[computer1%10];
    }

    else if (computer1 == 100)
    	numToWord += "One Hundred";
    //System.out.println("One hundred");


    else if(computer1>100 && computer1<1000) {
    	String x = ones[computer1/100];
    	int y = computer1%100;
    	if(y>19) {
    		z = tens[y/10];
    		int w = y%10;
    		q = ones[w];
    		//System.out.println(x + " " + "hundred" + " " + z + " "+ q);
    		numToWord += x + " " + "hundred" + " " + z + " "+ q;
    	}
    	else {
    		q = ones[y];
    		//System.out.println(x + " " + "hundred" + " " + q);
    		numToWord += x + " " + "hundred" + " " + q;
    	}
    
    }

    else if (computer1 == 1000)
    	//      System.out.println("One thousand");
    	numToWord += "One thousand";
    	}
    
public static String []ones = {"","One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
public static String []tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    
}
