class Test {
    public static void main(String[] args) {
        int [] arr={12,23,42,34};
System.out.println(arr[3]);
try{
System.out.println(arr[5]);
}
catch(ArrayIndexOutOfBoundsException e){
   System.out.println("Exception is not bound");
  }
  }
 }
