package Test_Project.Models;

public class Branch {
    private final static String TABLENAME = "branch";

    private int id_branch;
    private String name;
    private String description;
    private int id_user_create;
    private int id_user_update;
    private String f_create;
    private String f_update;

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

    public String getF_create() {
        return f_create;
    }

    public void setF_create(String f_create) {
        this.f_create = f_create;
    }

    public String getF_update() {
        return f_update;
    }

    public void setF_update(String f_update) {
        this.f_update = f_update;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_branch() {
        return id_branch;
    }

    public void setId_branch(int id_branch) {
        this.id_branch = id_branch;
    }

    public static String getTABLENAME() {
        return TABLENAME;
    }

}
