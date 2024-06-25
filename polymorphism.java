class A{
void show(){
 System.out.println("It is java language");
  }
}
class B extends A{
void show(){
 System.out.println("It is java language");
  }

}
class C extends A{
void show(){
 System.out.println("It is object oriented language");
  }

}

class Test{
    
    public static void main(String[] args) {
   
        B obj=new B();
   obj.show();
C obj1=new C();
   obj1.show();

}
}
