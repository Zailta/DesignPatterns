package FactoryPattern;

public class Add implements Calculate{
    @Override
    public void calculate(int n, int m) {
        System.out.println(n+m);
    }
}
