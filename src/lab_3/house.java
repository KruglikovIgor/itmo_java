package lab_3;

import java.time.LocalDate;

public class house {
    String name;
    int floor;
    int year;

    public house(String name, int floor, int year) {
        this.name = name;
        this.floor = floor;
        this.year = year;
    }

    public void print(){
        System.out.println(name + " " + floor + " " + year);
    }

    public int yearPassed(){
        return LocalDate.now().getYear()-year;
    }
    public house() {
    }

    public void setValue(String name, int floor, int year) {
        this.floor = floor;
        this.year = year;
        this.name = name;
    }
}
