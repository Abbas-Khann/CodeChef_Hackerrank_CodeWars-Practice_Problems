/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
		   double x = sc.nextDouble();
		   double y = sc.nextDouble();
		   double dividedValue = (y / x) * 100;
		   if(dividedValue >= 50) {
		        System.out.println("Yes");
		   }
		   else {
		       System.out.println("No");
		   }
		}
	}
}
