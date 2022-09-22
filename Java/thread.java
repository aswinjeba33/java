class classA extends Thread{
public void run(){
System.out.println("Start ThreadA...");
for(int i=1;i<=5;i++)
{
if(i==1)yield();
System.out.println("from threadA:j="+i);
}
System.out.println("...exit ThreadA");
}
}
class classB extends Thread{
public void run(){
System.out.println("start ThreadB...");
for(int j=1;j<=5;j++)
{
System.out.println("from ThreadB:j="+j);
if (j==2)stop();
}
System.out.println("...exit ThreadB");
}
}
