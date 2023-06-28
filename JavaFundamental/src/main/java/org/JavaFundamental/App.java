package org.JavaFundamental;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Thread javaThread =new Thread(()->{
    	   System.out.println("welcome to java");
       });
       

       Thread pythonThread =new Thread(()->{
    	   System.out.println("Welcome to python ");
       });
       
       Thread javascriptThread =new Thread(()->{
         System.out.println("Welcome to javascript ");   	   
       });
       
       Thread shellScript =new Thread(()->{
    	   System.out.println("Welcome to shell Script");
       });
       
       javaThread.start();
       pythonThread.start();
       javascriptThread.start();
       shellScript.start();
       
       
    }
}
