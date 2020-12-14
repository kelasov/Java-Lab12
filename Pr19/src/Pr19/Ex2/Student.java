package Pr19.Ex2;

public class Student{
    private int iDNumber;
    private double gpa;
    private static int k = 0;
    private String fio;

    public Student(double gpa, String fio) {
        k++;
        this.gpa = gpa;
        this.iDNumber = k;
        this.fio = fio;
    }

    public Student(int iDNumber, double gpa, String fio) {
        this.iDNumber = iDNumber;
        this.gpa = gpa;
        this.fio = fio;
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                ", fio='" + fio + '\'' +
                '}';
    }

    public boolean compareTo(String fio){
        if (this.getFio().equals(fio)) {
            return true;
        }
        return false;
    }
}