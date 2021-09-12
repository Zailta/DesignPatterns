package TemplateMethodPattern;

public abstract class DataProcessor {
    public void readDataProcesses(){
        readData();
        processData();
        saveData();
    }
    abstract void readData();
    abstract void processData();
    public void saveData(){
        System.out.println("The data is being saved in the Database ");
    }

}
