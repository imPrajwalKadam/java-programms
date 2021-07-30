import java.util.*;
import Aths.matrix;

class program155
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		matrix mobj = new matrix(row,col);
		mobj.Accept();
		mobj.Display();
		
		System.gc();
	}
}


























