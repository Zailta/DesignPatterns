package TemplateMethodPattern;

public class TemplateTester {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new ExcelFile();
        dataProcessor.readDataProcesses();
    }
}
