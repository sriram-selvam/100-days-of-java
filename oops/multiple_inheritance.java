//multiple inhertance 
public class Main
{
    int r=10;
    public void car(int a,int b)
    { 
       
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        
        food s=new food();
        s.bus();
        s.car(10,20);
        s.eat();
    }
}
class vehicle extends Main
{
    public void bus()
    {
        System.out.println("Bus is running");
    }
}
class food extends vehicle
{
    public void eat()
    {
        System.out.println("Eat me");
    }
}