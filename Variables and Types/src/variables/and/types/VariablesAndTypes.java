/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables.and.types;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class VariablesAndTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            //Number
            byte b = 127;
            System.out.println("byte = "+b);
            short s = 30000;
            System.out.println("short = "+s);
            int i = 5;
            System.out.println("integer = "+i);
            long l = 5;
            System.out.println("long = "+l);
            double d = 4.5;
            System.out.println("double = "+d);
            float f = 4.5f;
            System.out.println("float = "+f);
            
            //Characters adn String
            char c = 'a';
            System.out.println("char = "+c);
            String s1 = new String("Brama");
            String s2 = "Diana";
            String s3 = s1 + s2;
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            String s4 = "Brama "+i+" Diana";
            System.out.println(s4);
            
            //Boolean
            boolean bool = true;
            System.out.println("boolean = "+bool);
            
            
    }
    
}
