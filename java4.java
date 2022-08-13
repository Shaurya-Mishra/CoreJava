public class java4 {
    void meth1()
    {
        java4 aboj=new java4();
        aboj.meth5();
        int a = 10;
        System.out.println(10);
        System.out.println(78+a);
    }
    void meth5()
{
    int a = 29;
    System.out.println(78-a);
}
   void meth3(){
    java4 aboj = new java4();
    System.out.println("hello world");
    System.out.println("good morning");
    aboj.meth1();
   }
   void meth2()
   {
    System.out.println(67);
    System.out.println(87);
    System.out.println(87);
   }
   void meth4()
   {
    System.out.println("hello");
    System.out.println("real");
   }
   public static void main(String[] args) {
    System.out.println("start");
    java4 aboj =new java4();
    aboj.meth1();
    aboj.meth3();
    aboj.meth5();
    aboj.meth4();
    System.out.println("end");
   }
}
