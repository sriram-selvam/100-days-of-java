// Single inheritance
public class Main
{
    int r=10;
    public void car(int a,int b)
    { 
       
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        
        vehicle s=new vehicle();
        s.bus();
        s.car(10,20);
        
    }
}
class vehicle extends Main
{
    public void bus()
    {
        System.out.println("Bus is running");
    }
}
// Single inheritance and runtime polymorphism(Overriding)
public class Main
{
    int r=10;
    public void car(int a,int b)
    { 
       
        System.out.println(a+b);
    }
   
    public static void main(String args[])
    {
        
        Main s=new vehicle();
        // s.bus();
        s.car(10,20);
    }
}
class vehicle extends Main
{
    public void car(int a,int b)
    {
        System.out.println(a-b);
    }
}