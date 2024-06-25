package com.gfg.enumerationdemo;

public class EnumDemo {

    public static void main(String[] args) {
        //Day day = new Day();
        Day day = Day.SUNDAY;

        System.out.println(day.getName());
        System.out.println(day.getNumber());
    }
}

enum Day {
    SUNDAY("SUN", 1), MONDAY("MON", 2), TUESDAY("TUE", 3),
    WEDNESDAY("WED", 4), THURSDAY("THU", 5), FRIDAY("FRI", 6),
    SATURDAY("SAT", 7);

    private String name;

    private Integer number;

    private Day(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }
}
//------------------------------------------------------------------------------------------------

class Lecture {

    private String name;

    private String mentor;

    private Status status;


}

enum Status {
    UPCOMING("Upcoming"), LIVE("Live"), ARCHIVED("Archived");

    private String value;

    private Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}