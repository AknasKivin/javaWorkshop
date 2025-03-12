public class File1{
    public String Concatenator(String name,String name1){
        String name2=name+" "+name1;
        return name2;
    }
        public static void main(String args[])
        {
            File1 obj=new File1();
            String x=obj.Concatenator("Aknas","Kivin");
            System.out.println(x);

        }
    
}