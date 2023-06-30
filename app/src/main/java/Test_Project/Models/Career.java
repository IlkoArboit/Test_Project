package Test_Project.Models;

public class Career {
    private final static String TABLENAME = "career";

    private int id_career;

    public int getId_career() {
        return id_career;
    }

    public void setId_career(int id_career) {
        this.id_career = id_career;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int title_intermediate;

    public int getTitle_intermediate() {
        return title_intermediate;
    }

    public void setTitle_intermediate(int title_intermediate) {
        this.title_intermediate = title_intermediate;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int duration_months;

    public int getDuration_months() {
        return duration_months;
    }

    public void setDuration_months(int duration_months) {
        this.duration_months = duration_months;
    }

    private int id_type_career;

    public int getId_type_career() {
        return id_type_career;
    }

    public void setId_type_career(int id_type_career) {
        this.id_type_career = id_type_career;
    }

    private int id_modality;

    public int getId_modality() {
        return id_modality;
    }

    public void setId_modality(int id_modality) {
        this.id_modality = id_modality;
    }

    private int id_branch;

    public int getId_branch() {
        return id_branch;
    }

    public void setId_branch(int id_branch) {
        this.id_branch = id_branch;
    }

    private int id_range;

    public int getId_range() {
        return id_range;
    }

    public void setId_range(int id_range) {
        this.id_range = id_range;
    }

    private int id_user_create;

    public int getId_user_create() {
        return id_user_create;
    }

    public void setId_user_create(int id_user_create) {
        this.id_user_create = id_user_create;
    }

    private int id_user_update;

    public int getId_user_update() {
        return id_user_update;
    }

    public void setId_user_update(int id_user_update) {
        this.id_user_update = id_user_update;
    }

    private String f_create;

    public String getF_create() {
        return f_create;
    }

    public void setF_create(String f_create) {
        this.f_create = f_create;
    }

    private String f_update;

    public String getF_update() {
        return f_update;
    }

    public void setF_update(String f_update) {
        this.f_update = f_update;
    }

    public static String getTABLENAME() {
        return TABLENAME;
    }

}
