class Display{
	int x=10;
	int y=20;
void show(int x,int y)
{
 System.out.println(this.x);
 System.out.println(this.y);
}
 }
 class Test{
 public static void main(String args[]){
 Display obj=new Display();
obj.show(5,7);
}
}