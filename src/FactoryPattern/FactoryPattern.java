package FactoryPattern;

public class FactoryPattern {
    public Calculate getCalculation(String type){
      Calculate object ;
        if(type.equalsIgnoreCase("add")){
            object = new Add();
        }
        else {
            object = new Sub();
        }
        return object;
    }
}
