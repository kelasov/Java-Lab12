package Pr14;

public class Main {
    public static void main(String[] args) {
        Test[] st= new Student[5];
        st[0] = new Student(3.4, 1);
        st[1] = new Student(3, 2);
        st[2] = new Student(4.9, 3);
        st[3] = new Student(4.2, 4);
        st[4] = new Student(4.4, 5);

        Student.linearSearch(st, 4.2);
        Student.binarySearch(st, 1, 5, 4.4);
    }
}