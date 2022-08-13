public class static1 
{
    int x=12;//instance variable
    static int y= 45;//static variable
    void m1()
    {
        System.out.println("instance method m1()");
    }
    void m2()
    {
        System.out.println(x);
        new static1(500).m1();
        System.out.println(y);
        m3();
        System.out.println("instance method2()");
    }
    static void m3()
    {
        System.out.println("static method3() is called ");
    }
    static1(int a)
    {
        y= a;
    }
    static1()
    {
        y= 50-38;
    }
    public static void main(String[] args) 
    {
        System.out.println(y);
        m3();
        static1 a = new static1();
        System.out.println(a.x);
        a.m2();
        
    }
    
}