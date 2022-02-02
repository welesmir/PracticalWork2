package com.codespace.work22;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Task22 {
    public static void main(String[] args) {
        long yourmilliseconds = System.currentTimeMillis();
//        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm.sss");
        Date resultdate = new Date(yourmilliseconds);
        System.out.println("сегодня(сечас): " + sdf.format(resultdate));

        //сколько прошло дней - сам вычисляю
        long day_cnt = yourmilliseconds / (24*60*60*1000);
//        System.out.println("от 01.01.1970 прошло: ");
//        System.out.println("                дней: " + day_cnt);

        // 09/28/2015
//        System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()));

        // 20150928_161823
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse("01.01.1970", formatter);
//        LocalDate endDate = LocalDate.parse("05.03.2013", formatter);
//        LocalDate endDate = LocalDate.parse(new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime()), formatter);
        LocalDate endDate = LocalDate.now();
//        System.out.println("endDate: " + formatter.format(endDate));


        Period period = Period.between(startDate, endDate);

        System.out.println("от 01.01.1970 прошло: ");
        System.out.println("          всего дней: " + day_cnt);
        System.out.println(" ==========================  ЭТО: ");
        System.out.println("                             лет: " + period.getYears());
        System.out.println("                         месяцев: " + period.getMonths());
        System.out.println("                            дней: " + period.getDays());




    }
}
