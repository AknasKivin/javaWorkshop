public class Demo{
    public void add(int num1,int num2){
        int num3=num1+num2;
        System.out.println(num3);
    }
    public static void main(String args[]){
        Demo obj=new Demo();
        obj.add(10,20);
    }
}