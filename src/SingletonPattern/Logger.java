package SingletonPattern;

public class Logger {
    public static void main(String[] args) {
        SingletonPattern s = SingletonPattern.getInstance();
        s.print();
        System.out.println(s);
    }
}
