interface ABC{
        final int x=10;
	final int y=20;
 public void first();
public void second();
}
class MyClass implements ABC
 {
  		public void first(){
      System.out.println("first method implemented");
    } 
public void second(){
      System.out.println("Second method implemented");
    } 

}
class Test{
    public static void main(String args[]){
           MyClass obj=new MyClass();
	  System.out.println(  );
       obj.first();
      obj.second();
   }
 }