package Test_Project.Models;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.sql.Date;
public class CampusCareer {
private final static String TABLENAME = "campus_career";
public static String getTABLENAME() {return TABLENAME;}
	@JsonProperty("id_campus_career")
	private int id_campus_career;
	public int getIdCampusCareer() {
		return id_campus_career;
	}
	public void setIdCampusCareer(int id_campus_career) {
		this.id_campus_career = id_campus_career;
	}
	@JsonProperty("id_campus")
	private int id_campus;
	public int getIdCampus() {
		return id_campus;
	}
	public void setIdCampus(int id_campus) {
		this.id_campus = id_campus;
	}
	@JsonProperty("id_career")
	private int id_career;
	public int getIdCareer() {
		return id_career;
	}
	public void setIdCareer(int id_career) {
		this.id_career = id_career;
	}
	@JsonProperty("id_requirement")
	private int id_requirement;
	public int getIdRequirement() {
		return id_requirement;
	}
	public void setIdRequirement(int id_requirement) {
		this.id_requirement = id_requirement;
	}
	@JsonProperty("id_user_create")
	private int id_user_create;
	public int getIdUserCreate() {
		return id_user_create;
	}
	public void setIdUserCreate(int id_user_create) {
		this.id_user_create = id_user_create;
	}
	@JsonProperty("id_user_update")
	private int id_user_update;
	public int getIdUserUpdate() {
		return id_user_update;
	}
	public void setIdUserUpdate(int id_user_update) {
		this.id_user_update = id_user_update;
	}
	@JsonProperty("f_create")
	private String f_create;
	public String getFCreate() {
		return f_create;
	}
	public void setFCreate(String f_create) {
		this.f_create = f_create;
	}
	@JsonProperty("f_update")
	private String f_update;
	public String getFUpdate() {
		return f_update;
	}
	public void setFUpdate(String f_update) {
		this.f_update = f_update;
	}
}