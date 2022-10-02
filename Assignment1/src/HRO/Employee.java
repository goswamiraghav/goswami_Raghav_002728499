/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HRO;

import java.util.Date;

/**
 *
 * @author raghavgoswami
 */
public class Employee {
    private String Name;
    private String EmployeeID;
    private int Age;
    private String Gender;
    private Date StartDate;        
    private int Level;
    private String TeamInfo;
    private String PositionTitle;
    private int CellPhone;
    private String Email;
    private String ImageUpload;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getPositionTitle() {
        return PositionTitle;
    }

    public void setPositionTitle(String PositionTitle) {
        this.PositionTitle = PositionTitle;
    }

    public int getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(int CellPhone) {
        this.CellPhone = CellPhone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getImageUpload() {
        return ImageUpload;
    }

    public void setImageUpload(String ImageUpload) {
        this.ImageUpload = ImageUpload;
    }

    @Override
    public String toString() {
        return Name;
    }
    
    
}

