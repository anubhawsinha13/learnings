package com.a3.learnings.chapter101;

import com.a3.learnings.chapter101.models.Car;
import com.a3.learnings.chapter101.models.SimpleCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //An object which represents 
    	Car porsche = new Car();
        Car jaguar = new Car();
        porsche.setModel("carrera");
        System.out.println( porsche.getModel());
        
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(100.00);
        simpleCalculator.setSecondNumber(50);
        
        System.out.println("Addition --"+simpleCalculator.getAdditionResult());
        
        try {
        	 SimpleCalculator simpleCalc = 
             		(SimpleCalculator)Class.forName("com.a3.learnings.chapter101.models.SimpleCalculator").newInstance();
        	 
        	 simpleCalc.setFirstNumber(200);
        	 simpleCalc.setSecondNumber(25);
        	 System.out.println("Substrction result-->"+simpleCalc.getSubstractionResult());
        	 
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        
       
    }
}
