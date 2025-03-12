public class File1{
    public void add(int num1,int num2){
         int num3=num1+num2;
        System.out.println(num3);
    }
    public static void main(String args[]){
        File1 obj=new File1();
        obj.add(10,20);
    }
}