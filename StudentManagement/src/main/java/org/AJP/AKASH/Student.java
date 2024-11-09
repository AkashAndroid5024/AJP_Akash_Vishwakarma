package org.AJP.AKASH;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="student")
public class Student {

    @Id
    private String sId;
    private String fName;
    private String lName;
    private Date dob;
    private String gender;
    private String email;
    private String phone;
    private int marks;
    public String getsId() {
        return sId;
    }
    public void setsId(String sId) {
        this.sId = sId;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public Student(String sId, String fName, String lName, Date dob, String gender, String email, String phone, int marks) {
        super();
        this.sId = sId;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.marks = marks;
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    // Override toString() method
    @Override
    public String toString() {
        return "Student{" +
                "ID='" + sId + '\'' +
                ", First Name='" + fName + '\'' +
                ", Last Name='" + lName + '\'' +
                ", Date of Birth=" + dob +
                ", Gender='" + gender + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phone + '\'' +
                ", Marks=" + marks +
                '}';
    }

}
