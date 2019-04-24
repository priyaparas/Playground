import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponient = in.nextInt();
    System.out.print(power_of_a_number(base,exponient));
   }
     public static int power_of_a_number(int base, int exponient)
                     {
                       int power =1;
                       while(exponient>=1)
                       {
                         power = power*base;
                         exponient--;
                       }
                       return power;
                     }
                     }
                     