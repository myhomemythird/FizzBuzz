package org.richardliao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	System.out.println("Stage 1: ");
        for (int i = 1; i <= 100; ++i) {
	    System.out.println(translate(i));
	}
	
	System.out.println("Stage 2: ");
        for (int i = 1; i <= 100; ++i) {
	    System.out.println(translate1(i));
	}
    }

    public static String translate(int num) {
	if (num % 15 == 0)
	    return "FizzBuzz";
	else if (num % 3 == 0)
	    return "Fizz";
	else if (num % 5 == 0)
	    return "Buzz";
	else
	    return num + "";
    }
    
    public static String translate1(int num) {
	if (num % 15 == 0)
	    return "FizzBuzz";
	else if (num % 3 == 0)
	    return "Fizz";
	else if (num % 5 == 0)
	    return "Buzz";
	else if ((num + "").indexOf("3") > -1 && (num + "").indexOf("5") > -1)
	    return "FizzBuzz";
	else if ((num + "").indexOf("3") > -1)
	    return "Fizz";
	else if ((num + "").indexOf("5") > -1)
	    return "Buzz";
	else
	    return num + "";
    }
}
