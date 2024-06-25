class Student{
     int rollno;
	String name;
Student(int rollno,String name){
  this.rollno=rollno;
  this.name=name;

    }

}
class Test{
 public static void main(String args[]){

Student obj1=new Student(01,"Sujata");

Student obj2=new Student(02,"Sanika");

Student obj3=new Student(03,"Anita");

Student obj4=new Student(04,"Harshada");

System.out.println(obj1.rollno);
System.out.println(obj1.name);

System.out.println(obj2.rollno);
System.out.println(obj2.name);

System.out.println(obj3.rollno);
System.out.println(obj3.name);

System.out.println(obj4.rollno);
System.out.println(obj4.name);

  }
}