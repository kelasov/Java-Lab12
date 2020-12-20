package Pr24.Ex3;

public class Shirt {
    private String number, name, color, size;

    Shirt(String arr){
        try{
            String str[] = arr.split(",");
            number = str[0];
            name = str[1];
            color = str[2];
            size = str[3];
        }
        catch (Exception ex){
            System.out.println("Ошибка");
        }
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}