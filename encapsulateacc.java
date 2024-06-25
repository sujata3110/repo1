class Sample{
void display(){
  System.out.println("This is Encapsulate Method...");
  }
void getDisplay(){
display();
}
}

class Test{
    
    public static void main(String args[]) {
  	Sample obj=new Sample();
        obj.getDisplay();
   }
}
