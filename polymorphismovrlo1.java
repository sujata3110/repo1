class Addition{
void sum(int x,int y ,int z){
 	int sum=x+y+z;
  System.out.println("Sum="+sum);
    }
void sum(int x, int y ){
 	int sum=x+y;
  System.out.println("Sum="+sum);
    }
void sum(double x, int y ){
 	double sum=x+y;
  System.out.println("Sum="+sum);
    }

}
class Test{
    
    public static void main(String args[]) {
   		Addition obj=new Addition();
    			obj.sum(23,4,7);
    			obj.sum(4,7);
			obj.sum(3.2,4);
    }   
}