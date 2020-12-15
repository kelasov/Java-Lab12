package Pr20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion<T> {
    private List<T> list = new ArrayList<>();

    public Conversion(T[] arr){
        list.addAll(Arrays.asList(arr));
    }

    public T return1 (int i){
        return list.get(i);
    }

    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public void add(T a){
        list.add(a);
    }

    public List getList(){
        return list;
    }

    public void showList(){
        for (Object o: list){
            System.out.println(o);
        }
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "l=" + list +
                '}';
    }
}