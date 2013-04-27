package org.zezutom;

/**
 * Hello world!
 *
 */
public class App 
{
    public String sayHello() 
    {
	return "Hello everyone!";
    }

    public static void main( String[] args )
    {
        System.out.println(new App().sayHello());
    }
}
