package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
//try to run app
    public static void main( String[] args ) throws AgeException {
        //caller method the name is main
        try {
          ComparisonAge.divideBy(12,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
