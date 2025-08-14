import java.util.Scanner;
public class variable6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int a,b,c,result;
         System.out.print("Enter the value of a");
          a=sc.nextInt();
         System.out.print("Enter the value of b");
          b=sc.nextInt();
         System.out.print("Enter the value of c");
          c=sc.nextInt();
         result=(b*b)-(4*a*c);
         System.out.println(result);
         sc.close();



    }
}