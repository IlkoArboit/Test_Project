package Test_Project.Models;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.sql.Date;
public class University {
private final static String TABLENAME = "university";
public static String getTABLENAME() {return TABLENAME;}
	@JsonProperty("id_university")
	private int id_university;
	public int getIdUniversity() {
		return id_university;
	}
	public void setIdUniversity(int id_university) {
		this.id_university = id_university;
	}
	@JsonProperty("name")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("id_management")
	private int id_management;
	public int getIdManagement() {
		return id_management;
	}
	public void setIdManagement(int id_management) {
		this.id_management = id_management;
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