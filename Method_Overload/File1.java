public class File1{
        void add(int a,int b){
            System.out.println("Answer is:"+(a+b));
        }
        void add(int a,int b,int c){
            System.out.println("Answer is:"+(a+b+c));
        }
            public static void main(String args[]){
                File1 obj=new File1();
                obj.add(10,20);
                obj.add(10,20,40);
        }
    }