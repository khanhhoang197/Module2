import java.util.List;

public class Intern extends Employee{
    private String majors, semester, university_name;

    public Intern(){

    }

    public Intern(int id, String fullName, String birthDay, int phone, String email, int employee_type, String majors, String semester, String university_name, List<Certificate> certificates) {
        super(id, fullName, birthDay, phone, email, employee_type,certificates);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    @Override
    public void showInfo() {

    }
    public String showMe() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", university_name='" + university_name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                ", employee_type=" + employee_type +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", certificates=" + certificates +
                '}';
    }
}
