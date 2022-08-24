import java.util.List;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience(){

    }

    @Override
    public void showInfo() {

    }

    public Experience(int id, String fullName, String birthDay, int phone,
                      String email, int employee_type, int expInYear,
                      String proSkill, List<Certificate> certificates){
        super(id, fullName, birthDay, phone, email, employee_type, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;

    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public String showMe() {
        return "Experience{" +
                " id = " + id +
                ", fullName = '" + fullName + '\'' +
                ", birthDay = '" + birthDay + '\'' +
                ", phone = " + phone +
                ", email = '" + email + '\'' +
                ", employee_type = " + employee_type +
                ", expInYear = " + expInYear +
                ", proSkill = '" + proSkill + '\'' +
                ", certificates = " + certificates +
                '}';
    }
}
