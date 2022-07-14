public class question5 {
          static char ch = 'a';
          
          static void Display()
          {
                    if(ch <= 'f')
                    {
                              System.out.print(ch+"\t");
                              ch++;
                              Display();
                    }
          }
          public static void main(String arg[])
          {
                    Display();
          }
}
