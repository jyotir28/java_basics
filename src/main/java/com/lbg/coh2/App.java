package com.lbg.coh2;

/**
 * Hello world!
 *
 */
public class App 
{	
	int x=1;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int y = 4;	// decl with assignment 
        App obj = new App();
        int x = 88;
        System.out.println( obj.x );
        System.out.println(x);
        System.out.println(obj.check(44, 45));
    }
    
     int check(int a,int b) {
    	return a+b;
    }
}
