package Pr24.Ex4;

public class Phone {
    private String numb;
    private String correct="";

    public Phone(String numb) {
        this.numb = numb;
    }

    public void Return(){
        char[] chars = numb.toCharArray();
        int k=0;
        if (!numb.contains("+")) {
            correct += "+7";
            for (int i = 1; i < chars.length; i++) {
                if (i == 4 || i == 7) {
                    correct += "-";
                }
                correct += String.valueOf(chars[i]);
            }
        }
        else {
            correct+="+";
            for (int i=1; i<chars.length - 7; i++){
                correct+=String.valueOf(chars[i]);
            }
            correct+="-";
            for (int i=chars.length-7;i<chars.length;i++) {
                if (k == 3) { correct+="-";}
                k++;
                correct+=String.valueOf(chars[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mainNumb=" + correct +
                '}';
    }
}