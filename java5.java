public class java5 
{
    void add(){
        int a = 20;
        int b = 34;
        int c = a+b;
        System.out.println("Addition:"+c);
        java5 aboj= new java5();
        aboj.mul();

    }
    void sub(){
        int a= 20;
        System.out.println("substraction:"+(a-8));
    }
    void mul()
    {
        int a = 6;
        System.out.println("multiplication:"  +a*8);   
    }
    void div()
    {
        System.out.println("Division:"  +(78/6));
    }
public static void main(String[] args) {
    System.out.println("start");
    java5 aobj= new java5();
    aobj.add();
    aobj.sub();
    aobj.mul();
    aobj.div();
    System.out.println("end");
}
    
}
