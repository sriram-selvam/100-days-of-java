When two or more classes inherits a single class, it is known as hierarchical inheritance. 


public class Main
{
    public void eat()
    {
        System.out.println("hai im eating");
    }
    public static void main(String args[])
    {
       bath s=new bath();
       s.bath();
       s.eat();
       sleep ex=new sleep();
       ex.sleep();
       ex.eat();
    }
}
class bath extends Main 
{
     public void bath()
    {
        System.out.println("hai im bathing");
    }
}
class sleep extends Main
{
     public void sleep()
    {
        System.out.println("hai im sleeping");
    }
}
//multiple inheritance in java
Reason for multiple inheritance not supported in java
Consider a scenario where A, B, and C are three classes. 
The C class inherits A and B classes. 
If A and B classes have the same method and you call it from child class object, 
there will be ambiguity to call the method of A or B class.

class A{  
    void msg(){System.out.println("Hello");}  
    }  
    class B{  
    void msg(){System.out.println("Welcome");}  
    }  
    class C extends A,B{//suppose if it were  
       
     public static void main(String args[]){  
       C obj=new C();  
       obj.msg();//Now which msg() method would be invoked?  
    }  
    }  
    