/*
3. Write a recursive program which accept string from user and count number 
of small characters. 
Input : HElloWOrlD 
Output : 5
 */
import java.util.*;

public class question3 {
          static int iCnt = 0;
          static int i = 0;
          static char ch[];

          static int Small(String str)
          {
                    ch = str.toCharArray();
                    if(i < ch.length)
                    {
                              if((ch[i] >= 'a' )&&(ch[i] <= 'z'))
                              {
                                        iCnt++;
                              }
                              i++;
                              Small(str);

                    }
                    return iCnt;
          }

          public static void main(String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter String : ");
                    String str = sobj.nextLine();
                    int ret = Small(str);
                    System.out.print("count of small character is : "+ret);
          }
}
