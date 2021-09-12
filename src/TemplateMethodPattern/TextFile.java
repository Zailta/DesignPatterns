package TemplateMethodPattern;

public class TextFile extends DataProcessor{
    @Override
    void readData() {
        System.out.println("The data is being read in Text File");
    }

    @Override
    void processData() {
        System.out.println("The data is being processed in Text File ");

    }
}
