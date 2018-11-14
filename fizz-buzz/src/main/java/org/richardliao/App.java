package org.richardliao;

import java.util.ArrayList;
import java.util.List;

import org.richardliao.services.InterfaceTranslator;
import org.richardliao.services.impl.BuzzTranslator;
import org.richardliao.services.impl.BuzzTranslatorS2;
import org.richardliao.services.impl.FizzBuzzTranslator;
import org.richardliao.services.impl.FizzBuzzTranslatorS2;
import org.richardliao.services.impl.FizzTranslator;
import org.richardliao.services.impl.FizzTranslatorS2;

/**
 * Hello world!
 *
 */
public class App 
{
	private static List<InterfaceTranslator> translators = new ArrayList<>(); 
	private static List<InterfaceTranslator> translatorsS2 = new ArrayList<>(); 
	
	static {
		translators.add(new FizzBuzzTranslator());
		translators.add(new FizzTranslator());
		translators.add(new BuzzTranslator());
		translatorsS2.addAll(translators);
		translatorsS2.add(new FizzBuzzTranslatorS2());
		translatorsS2.add(new FizzTranslatorS2());
		translatorsS2.add(new BuzzTranslatorS2());
	}
	
    public static void main( String[] args )
    {
    	System.out.println("Stage 1: ");
        for (int i = 1; i <= 100; ++i) {
        	System.out.println(translate(i));
        }
	
        System.out.println("Stage 2: ");
        for (int i = 1; i <= 100; ++i) {
        	System.out.println(translateS2(i));
        }
        
        System.out.println("Stage 1 with interface: ");
        for (int i = 1; i <= 100; ++i) {
        	System.out.println(translateWithInterface(i));
        }
        
        System.out.println("Stage 1 with interface S2: ");
        for (int i = 1; i <= 100; ++i) {
        	System.out.println(translateWithInterfaceS2(i));
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
    
    public static String translateS2(int num) {
    	if (num % 15 == 0)
    		return "FizzBuzz";
    	else if (num % 3 == 0)
    		return "Fizz";
    	else if (num % 5 == 0)
    		return "Buzz";
    	else if (String.valueOf(num).indexOf("3") > -1 && String.valueOf(num).indexOf("5") > -1)
    		return "FizzBuzz";
    	else if (String.valueOf(num).indexOf("3") > -1)
    		return "Fizz";
    	else if (String.valueOf(num).indexOf("5") > -1)
    		return "Buzz";
    	else
    		return String.valueOf(num);
    }
    
    public static String translateWithInterface(int num) {
    	return translate(translators, num);
    }
    
    public static String translateWithInterfaceS2(int num) {
    	return translate(translatorsS2, num);
    }
    
    private static String translate(List<InterfaceTranslator> translators, int num) {
    	for (int i = 0; i < translators.size(); ++i) {
    		if (translators.get(i).accept(num))
    			return translators.get(i).translate();
    	}
    	return String.valueOf(num);
    }
}
