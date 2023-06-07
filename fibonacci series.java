import java.util.Scanner;

class fibonaccii{
    public static void main(String k[])
    {
        System.out.println("enter the number");
        Scanner  sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        
        int i=0;
        int a=0;
        int b=1;
        System.out.println(a+ "");

        for( i=0;i<= n;i++)
        
        {
        System.out.println("h" );
        int temp=b;
        b=a+b;
        a=temp;

        
        
    }
    }
}