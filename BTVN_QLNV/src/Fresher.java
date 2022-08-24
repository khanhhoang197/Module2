import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{
    private String graduation_rank, education, graduation_date;

    public  Fresher(){

    }

    public  Fresher(int id, String fullName, String birthDay, int phone, String email, int employee_type, String graduation_date, String graduation_rank, String education, List<Certificate> certificates){
        super(id, fullName, birthDay, phone, email, employee_type,certificates);
        this.graduation_rank = graduation_rank;
        this.graduation_date = graduation_date;
        this.education = education;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }
//    @Override
//    public void showInfo() {
//
//    }
    public String showMe() {
        return "Fresher{" +
                "id = " + id +
                ", fullName = '" + fullName + '\'' +
                ", birthDay = '" + birthDay + '\'' +
                ", phone = " + phone +
                ", email = '" + email + '\'' +
                ", employee_type = " + employee_type +
                ", certificates = " + certificates +
                "graduation_rank = '" + graduation_rank + '\'' +
                ", education = '" + education + '\'' +
                ", graduation_date = '" + graduation_date + '\'' +
                '}' + super.showInfo();
    }
}
