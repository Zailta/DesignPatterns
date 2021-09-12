package TemplateMethodPattern;

public class ExcelFile extends DataProcessor{

    @Override
    void readData() {
        System.out.println("The data is being read in Excel File");
    }

    @Override
    void processData() {
        System.out.println("The data is being processed in Text File ");

    }
}
