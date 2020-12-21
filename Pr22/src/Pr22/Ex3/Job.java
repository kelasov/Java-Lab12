package Pr22.Ex3;

import java.util.Date;

public class Job {
    private Date start;
    private Date finish;

    public void getStart(){
        Date start = new Date();
        System.out.println("Задание взято: " + start);
    }

    public void getFinish(){
        Date finish = new Date();
        System.out.println("Задание сдано: " + finish);
    }
}