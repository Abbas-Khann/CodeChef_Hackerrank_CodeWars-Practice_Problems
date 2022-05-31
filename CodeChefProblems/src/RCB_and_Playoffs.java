import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i = 0; i < testcases; i++) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int maximum_score = 2 * z;
		    if(x + maximum_score >= y) {
		        System.out.println("Yes");
		    }
		    else {
		        System.out.println("No");
		    }

		}
	}
}
