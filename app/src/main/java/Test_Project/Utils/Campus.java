package Test_Project.Utils;

import java.util.Date;

public class Campus {

    private final static String TABLENAME = "campus";
    private int id_campus;
    private int id_university;
    private String name;
    private String location;
    private double latitude;
    private double longitude;
    private int main;
    private String www;
    private String email;
    private int id_user_create;
    private int id_user_update;
    private Date f_create;
    private Date f_update;

    public Campus() {
    }

    public Campus(int id_campus, int id_university, String name, String location, double latitud, double longitud,
            int main, String www, String email, int id_user_create, int id_user_update, Date f_create, Date f_update) {
        this.id_campus = id_campus;
        this.id_university = id_university;
        this.name = name;
        this.location = location;
        this.latitude = latitud;
        this.longitude = longitud;
        this.main = main;
        this.www = www;
        this.email = email;
        this.id_user_create = id_user_create;
        this.id_user_update = id_user_update;
        this.f_create = f_create;
        this.f_update = f_update;
    }

    public static String getTABLENAME() {
        return TABLENAME;
    }

    public int getId_campus() {
        return id_campus;
    }

    public int getId_university() {
        return id_university;
    }

    public void setId_university(int id_university) {
        this.id_university = id_university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitud) {
        this.latitude = latitud;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitud) {
        this.longitude = longitud;
    }

    public int getMain() {
        return main;
    }

    public void setMain(int main) {
        this.main = main;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_user_create() {
        return id_user_create;
    }

    public void setId_user_create(int id_user_create) {
        this.id_user_create = id_user_create;
    }

    public int getId_user_update() {
        return id_user_update;
    }

    public void setId_user_update(int id_user_update) {
        this.id_user_update = id_user_update;
    }

    public Date getF_create() {
        return f_create;
    }

    public void setF_create(Date f_create) {
        this.f_create = f_create;
    }

    public Date getF_update() {
        return f_update;
    }

    public void setF_update(Date f_update) {
        this.f_update = f_update;
    }

    public void create() {
    }

    public void delete() {
    }

    public void update() {
    }

    private void exist() {
    }

    public void listCampus() {
    }
}
