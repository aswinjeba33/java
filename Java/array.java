import java.util.*;
public class array{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
 
System.out.print("Input number:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("values of array");

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

 System.out.println("The even Elements are:");
 for(int i=0;i<n;i++)
 {
  if(i%2==1)
 System.out.println(arr[2]);

 }
 }
 }
