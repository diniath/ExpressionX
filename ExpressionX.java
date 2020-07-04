/* expression: -x + x++ - --x + x , x=1
-x + x++ : first do the operation and then add 1 to x -> -1 +1 = 0, then add 1 to value of x. x is now 2
- --x + x : first subtract 1 from x, x has the value of 2 so it becomes 1, and then do the operation. so it is -1+1=0
so -x + x++ - --x + x = 0 */

public class ExpressionX{
	public static void main (String [] args){
		int x = 1;
		System.out.println (-x + x++ - --x + x);
	}

}