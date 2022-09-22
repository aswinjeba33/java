import java.util.*;
class input
{
public static void main(String[] args)
{
System.out.print("Input first : ");
Scanner sc =new Scanner(System.in);
int a = sc.nextInt();
System.out.print("num 2 is : ");
Scanner sd =new Scanner(System.in);
int b = sd.nextInt();

int c = a+b,d=a-b,e=a*b,f=a/b,g=a%b;
System.out.println("The addition is : " + c);
System.out.println("The subraction is : " + d);
System.out.println("The multiplication is : " + e);
System.out.println("The division is : " + f);
System.out.println("The remainder is : " + g);
}
}

