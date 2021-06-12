//method overloading
class Overload
{
    //method demo with one  integer parameter
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    //method demo with two parameter
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    //methode demo return a double value
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}
class MethodOverloading
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}
