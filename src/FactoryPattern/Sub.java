package FactoryPattern;

public class Sub implements Calculate{
    @Override
    public void calculate(int n, int m) {
        System.out.println(n-m);
    }
}
