public class Calculator {
    public Calculator(){}
    public int add(int x, int y){return x+y;}
    public double add(double x, double y){return Double.sum(x, y) ;}
    public long add(long x, long y){return Long.sum(x, y);}
    public int subtract(int x, int y){return x-y;}
    public double subtract(double x, double y){return x-y;}
    public long subtract(long x, long y){return x-y;}
    public int multiply(int x, int y){return x*y;}
    public double multiply(double x,double y){return x*y;}
    public long multiply(long x, long y){return x*y;}
    public int divide(int x, int y){return x/y;}
    public double divide(double x, double y){return x/y;}
    public long divide(long x, long y){return x/y;}
    public int modulo(int x, int y){return x%y;}
    public double modulo(double x, double y){return x%y;}
    public long modulo(long x, long y){return x%y;}
    public int power(int x, int y){return (int) Math.pow(x, y);}
    public double power(double x, double y){return Math.pow(x, y);}
    public long power(long x, long y){return (long) Math.pow(x, y);}
    
}
