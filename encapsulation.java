class Student 
{
	private int rollno=143;
	private String  name="Sujata Khot";
void getRollno()
{
  	System.out.println(this.rollno);
 }
void getName(){
  	System.out.println(this.name);
 }
void setRollno(){
 this.rollno=142;
}
void setName(){
 this.name="Anita Khot";
}
}
class Test
{
    
    public static void main(String args[]) 
{
   		Student obj=new Student();
               obj.getRollno();
               obj.setRollno();
		obj.getName();
		obj.setName();
               obj.getRollno();
		obj.setRollno();
		obj.getName();
		obj.setName();

		
    }
}
