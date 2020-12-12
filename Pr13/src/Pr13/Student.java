package Pr13;

public class Student {
    private int iDNumber;
    private double gpa;
    private static int k = 0;

    public Student(double gpa) {
        k++;
        this.gpa = gpa;
        this.iDNumber = k;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                '}';
    }
}