package SingletonPattern;

public class SingletonPattern {
    private static SingletonPattern SingletonPattern;


    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        if(SingletonPattern == null){
            SingletonPattern = new SingletonPattern();
        }
        return SingletonPattern;
    }
    void print(){
        System.out.println("The printer has been called ");
    }
}
