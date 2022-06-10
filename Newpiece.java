/*
 problem:
 Chef's favorite game is chess. Today, he invented a new piece and wants to see its strengths.

From a cell (X, Y)(X,Y), the new piece can move to any cell of the chessboard such that its color is different from that of (X, Y)(X,Y).

The new piece is currently located at cell (A, B)(A,B). Chef wants to calculate the minimum number of steps required to move it to (P, Q)(P,Q).

Note: A chessboard is an 8 \times 88×8 square board, where the cell at the intersection of the ii-th row and jj-th column is denoted (i, j)(i,j). Cell (i, j)(i,j) is colored white if i+ji+j is even and black if i+ji+j is odd.
 */
package Codechef.Java;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			try (Scanner sc = new Scanner(System.in)) {
                int t= sc.nextInt();
                while(t!=0)
                {
                  int a,b,p,q;
                  a=sc.nextInt();
                  b=sc.nextInt();
                  p=sc.nextInt();
                  q=sc.nextInt();
                  int sum1=a+b;
                  int div1=sum1%2;
                  int sum2=p+q;
                  int div2=sum2%2;
                  if(a==p && b==q)
                  {
                    System.out.println("0");
                  }
                  else if(div1!=div2)
                  {
                    System.out.println("1");
                  }
                  else if(div1==div2)
                  {
                    System.out.println("2");
                  }
                  t--;
                }
            }
	
	}
}
