class A 
{
    public void method(A a)
    {
        B b = (B)a;
        
    }
    public static void main(String[]args)
    {
        A a = new A();
        a.method(a);
    }
}