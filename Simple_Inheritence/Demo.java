class Parent{
    public void add(){
        System.out.print("Hello World");
    }
}
class Child extends Parent{
    void display(){
        add();
    }

}
public class Demo{
    public static void main(String args[]){
    Child obj=new Child();
    obj.display();
    }
}