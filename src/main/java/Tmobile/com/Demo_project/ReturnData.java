package Tmobile.com.Demo_project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReturnData {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pID;
    private  String id;
    private  String fname;
    private  String lname;
    private  String dept;

    public ReturnData() {
    }

    public ReturnData(String id, String fname, String lname, String dept) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dept = dept;
    }

    public Long getpID() {
        return pID;
    }

    public void setpID(Long pID) {
        this.pID = pID;
    }

    public String getId() {
        return id;
    }

    public void setId(String ID) {
        this.id = ID;
    }

    public String getFName() {
        return fname;
    }

    public void setFName(String FName) {
        this.fname = FName;
    }

    public String getLName() {
        return lname;
    }

    public void setLName(String LName) {
        this.lname = LName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
