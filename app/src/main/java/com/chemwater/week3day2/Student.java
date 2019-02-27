package com.chemwater.week3day2;

import android.os.Parcel ;
import android.os.Parcelable ;

public class Student implements Parcelable {

    private String studentId ;
    private String studentName ;
    private String studentMajor ;
    private String studentMinor ;
    private String expectedGradYear ;
    private String studentGPA ;
    private String completedHours ;

    protected Student(Parcel in) {
        studentId = in.readString();
        studentName = in.readString();
        studentMajor = in.readString();
        studentMinor = in.readString();
        expectedGradYear = in.readString();
        studentGPA = in.readString();
        completedHours = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public Student(String studentId, String studentName, String studentMajor, String studentMinor, String expectedGradYear, String studentGPA, String completedHours) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMajor = studentMajor;
        this.studentMinor = studentMinor;
        this.expectedGradYear = expectedGradYear;
        this.studentGPA = studentGPA;
        this.completedHours = completedHours;
    }

    public Student() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(studentId) ;
        parcel.writeString(studentName) ;
        parcel.writeString(studentMajor) ;
        parcel.writeString(studentMinor) ;
        parcel.writeString(expectedGradYear) ;
        parcel.writeString(studentGPA) ;
        parcel.writeString(completedHours) ;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMinor() {
        return studentMinor;
    }

    public void setStudentMinor(String studentMinor) {
        this.studentMinor = studentMinor;
    }

    public String getExpectedGradYear() {
        return expectedGradYear;
    }

    public void setExpectedGradYear(String expectedGradYear) {
        this.expectedGradYear = expectedGradYear;
    }

    public String getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(String studentGPA) {
        this.studentGPA = studentGPA;
    }

    public String getCompletedHours() {
        return completedHours;
    }

    public void setCompletedHours(String completedHours) {
        this.completedHours = completedHours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMinor='" + studentMinor + '\'' +
                ", expectedGradYear='" + expectedGradYear + '\'' +
                ", studentGPA='" + studentGPA + '\'' +
                ", completedHours='" + completedHours + '\'' +
                '}';
    }
}