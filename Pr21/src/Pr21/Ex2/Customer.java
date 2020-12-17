package Pr21.Ex2;

public class Customer implements Chair{
    private Chair chair;
    public void Sit(Chair chair){
    }

    public Customer(Chair chair) {
        this.chair = chair;
    }
}