import java.util.*;
class IPPackUnpack
{
	public int Packing(int no1,int no2,int no3,int no4)
	{
		int ans = 0;
		int i = no1<<24;
		int j = no2<<16;
		int k = no3<<8;
		int l = no4;
		ans = i | j | k | l;
		return ans;
	}
}




class program151
{
public static void main(String arg[])
{

	Scanner sobj = new Scanner(System.in);
	System.out.println("Enter First number");
	int iNo1 = sobj.nextInt();
	System.out.println("Enter Second number");
	int iNo2 = sobj.nextInt();
	System.out.println("Enter Third number");
	int iNo3 = sobj.nextInt();
	System.out.println("Enter fourth Number");
	int iNo4 = sobj.nextInt();

	IPPackUnpack obj = new IPPackUnpack();
	int iRet = obj.Packing(iNo1,iNo2,iNo3,iNo4);
	System.out.println("number is"+iRet);



}


	
}