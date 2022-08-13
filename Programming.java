public class Programming 
{
    Programming()
    {
        System.out.println("I love programming language");
    }
    String meth1(String s)
    {
         System.out.println("method1 called");
         return s;
    }
    public static void main(String[] args) 
    {
        Programming aobj = new Programming();
        aobj.meth1("i love java");
        
        
    }
    
}
