import java.util.Scanner;

public class swaping {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the value of a");
        a=sc.nextInt();
        System.out.print("Enter the value of b");
        b=sc.nextInt();

        c=a;
        a=b;
        b=c;
        System.out.println("After swapping vlaue of a is"+a+"and value of b is"+b);
        sc.close();

         
          



    }
}
    

