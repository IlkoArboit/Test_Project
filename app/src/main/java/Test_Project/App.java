/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Test_Project;

import java.io.Console;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Test_Project.Utils.Branch;
import Test_Project.Utils.Campus;
import Test_Project.Utils.DBConection;
import Test_Project.Utils.JsonDataFetcher;

public class App {
    private static ResultSet executeQuery;

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        try {
            Campus campus = JsonDataFetcher.fetchTableData(Campus.getTABLENAME(), "id_campus = 2", Campus.class);
            System.out.println(campus.getId_campus());
            System.out.println(campus.getId_university());
            System.out.println(campus.getName());
            System.out.println(campus.getLocation());
            System.out.println(campus.getLatitude() + " " + campus.getLongitude());
            System.out.println(campus.getMain() == 1 ? "Cede Principal" : "Cede secundaria");
            System.out.println(campus.getWww());
            System.out.println(campus.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}