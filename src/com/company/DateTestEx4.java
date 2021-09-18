//ex4
package com.company;

public class DateTestEx4 {
    public static void main(String[] args) {
        DateEx4 d1 = new DateEx4(11,13,2000);
        DateEx4 d2 = new DateEx4(20,18, 2021);

        d1.displayDate(d1.getMonth(), d1.getDay(), d1.getYear());
        d2.displayDate(d2.getMonth(), d2.getDay(), d2.getYear());
    }
}
