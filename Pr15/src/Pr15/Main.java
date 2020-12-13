package Pr15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("this");
        array.add("Array");
        array.add("List");
        for (String a: array){
            System.out.println(a);
        }

        System.out.println();

        LinkedList<String> linked = new LinkedList<String>();
        linked.add("this");
        linked.add("Linked");
        linked.add("List");
        for (String b: linked){
            System.out.println(b);
        }

        System.out.println();

        MyArrayList<String> myarray = new MyArrayList<String>();
        myarray.add("this");
        myarray.add("MyArray");
        myarray.add("List");
        for (int i=0;i<myarray.size();i++) {
            System.out.println(myarray.get(i));
        }
    }
}