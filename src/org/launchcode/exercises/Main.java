package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.jva");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String,String> set: studentFiles.entrySet()){
            System.out.println(set.getKey() + " " +CheckFileExtension(set.getValue() ));
        }
    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        if(y==0) {
            try  {
                throw new ArithmeticException("You cannot divide by zero!");
            } catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
        return (1.0*x)/y;
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        // if file ends in .java +1
        //if file doesnt end in .java 0
        //if file is null or emptystring exception thrown
        int output = 0;
        if (fileName == null || fileName == "") {
            output = -1;

            throw new RuntimeException("fileName cannot be null or empty");

        }
        if (!fileName.contains(".java")) {
            output =  0;
        } else if (fileName.contains(".java")) {
            output =  1;
        }

        return output;
    }

}
