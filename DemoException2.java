package Main.throwingexception;
import java.io.IOException;
/*
Creating a method to demonstrate use of exception declaration and to throw an exception*/


public class DemoException2 {
    //method to print the output ,on the basis of argument
    public void print(Object obj) throws IOException{
        if(obj != null){
            System.out.println(obj);
        }
        else{
            //generating and throw the exception
            throw new IOException("object can not be null");

        }
    }
    public static void main(String[]args){
        DemoException2 obj = new DemoException2();
        String s = "hello world";
        try {
            obj.print(s);
        }
        catch(IOException e){
            System.out.println("String is null");
            System.out.println(e);
        }
    }

}
