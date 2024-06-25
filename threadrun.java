class Test
{
 public static void main(String args[])
{
      Thread t1=new Thread();
	t1.start();
        Thread t2=new Thread();
          t2.start();
System.out.println(t1.getName());
System.out.println(t2.getName());
t1.run();
t2.run();
   }
}