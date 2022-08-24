import java.util.List;

public abstract class Employee {
    protected int id, phone, employee_type;
    protected String fullName, email, birthDay;
    protected List<Certificate> certificates;
    public static int  employee_count = 0;
    public Employee(){

    }

    public Employee(int id, String fullName, String birthDay, int phone, String email, int employee_type, List<Certificate> certificates) {
        this.id = id;
        this.phone = phone;
        this.employee_count ++;
        this.employee_type = employee_type;
        this.fullName = fullName;
        this.email = email;
        this.birthDay = birthDay;
        this.certificates = certificates;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getEmployee_count() {
        return employee_count;
    }


    public int getEmployee_type() {
        return employee_type;
    }

    public void setEmployeet_ype(int employee_type) {
        this.employee_type = employee_type;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
//
    public abstract void showInfo();
//    public String showInfo() {
//        return "Employee{" +
//                "id=" + id +
//                ", fullName='" + fullName + '\'' +
//                ", birthDay='" + birthDay + '\'' +
//                ", phone=" + phone +
//                ", email='" + email + '\'' +
//                ", employee_type=" + employee_type +
//                ", certificates=" + certificates +
//                '}';
 // }
}
