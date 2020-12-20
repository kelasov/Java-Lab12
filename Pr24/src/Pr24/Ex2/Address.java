package Pr24.Ex2;

public class Address {
    private String country, region, town, street, house, housing, flat;
    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
    public void returnAddress(){
        try {
            String[] str = address.split(", ");
            str[0] = str[0].trim();
            country = str[0];
            region = str[1];
            town = str[2];
            street = str[3];
            house = str[4];
            housing = str[5];
            flat = str[6];
            str[6] = str[6].trim();
        }
        catch (Exception ex) {
            System.out.println("Ошибка");
        }
    }
}