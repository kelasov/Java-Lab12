package Pr24.Ex1;

public class Person {
    private String fio;
    private String surname;
    private String name;
    private String patronymic;

    public Person(String fio) {
        this.fio = fio;
    }

    public void setVse(){
        String str[] = fio.split(" ");
        surname = str[0];
        name = str [1];
        patronymic = str [2];
    }

    public String getSurname() {
        return surname;
    }
}