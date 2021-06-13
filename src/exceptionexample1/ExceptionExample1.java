/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample1;

/**
 *
 * @author marka
 */
public class ExceptionExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String welcome = "welcome!";
        char[] characters = welcome.toCharArray();

        // -- Java -- For each loop ------------------------------------
        for (char myChar : characters) {
            System.out.println(myChar);
        }
        // -------------------------------------------------------------

        try {
            String message = "message";
            char[] chars = message.toCharArray();
            char lastChar = chars[chars.length-1]; // (chars.length without -1) wrong index value (ArrayIndexOutOfBoundsException)
            System.out.println("The last char is: " + lastChar);
            
            
            // -- another exception type ------------------
            String nothing=null;
            System.out.println(nothing.length()); // nothing.length() causes (NullPointerException)
            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return; // this return prevents excuting System.out.println("The message after catch block!!!!");
        }
        
        catch(NullPointerException e){
            e.printStackTrace();
            return; // this return prevents excuting System.out.println("The message after catch block!!!!");
        }
        
        System.out.println("The message after catch block!!!!");

    }

}
