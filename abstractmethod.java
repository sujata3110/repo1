abstract class Employee{
		abstract void show();
}
class Rahul extends Employee{
 void show(){
 System.out.println("Employee name :Rahul");
  }
}
class Nisha extends Employee{
 void show(){
 System.out.println("Employee name :Nisha");
  }
}


class Test{
public static void main(String args[]){
	Rahul obj1=new Rahul();
	Nisha obj2=new Nisha();
	obj1.show();
	obj2.show();
  }
}