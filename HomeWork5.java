package ru.geekbrains.lesson5;



public class HomeWork5 {


public static final String PATH = "src/main/java/ru/geekbrains/lesson5/other_demo.csv";
public static final String OTHER_PATH = "src/main/java/ru/geekbrains/lesson5/other_demo.csv";

public static void main(String[] args) {
    String[] headers = { "Value 1", "Value 2", "Value 3"};
    int[][] data = {
            { 100, 200, 123 },
            { 300, 400, 500 }
    };
    AppData appData = new AppData(headers, data);

    System.out.println(appData);

    String[] otherHeaders = { "First", "Second", "Third" };
    int[][] otherData = {
            { 52, 424, 111 },
            { 76, 2, 321 }

    };
    AppData otherAppData = new AppData(otherHeaders, otherData);

    appData.writeToFile(PATH);
    AppData receivedAppData = AppData.readFromFile(PATH);
    System.out.println(receivedAppData);



    AppData receivedFromOtherPathData = AppData.readFromFile(OTHER_PATH);
    System.out.println(receivedFromOtherPathData);

}
}