
/*import java.util.Scanner;

class calcultor 
{
    public static void main(String,int[])

    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        c=a+b;
        System.out.println("%d",c);
        c=a-b;
        System.out.println("%d",c);

        c=a*b;
        System.out.println("%.2d",c);

        c=a/b;
        System.out.println("%.2f",c);



        



    }

*/
import java.util.Scanner;

class Calculator
 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        c = a + b;
        System.out.printf("%d%n", c);

        c = a - b;
        System.out.printf("%d%n", c);

        c = a * b;
        System.out.printf("%d%n", c);

        float d = (float) a / b;
        System.out.printf("%.2f%n", d);

        sc.close();
    }
}