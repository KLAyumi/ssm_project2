package com.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String DateToString(Date date,String patt){
        SimpleDateFormat dateFormat = new SimpleDateFormat(patt);
        String dateStr = dateFormat.format(date);
        return dateStr;
    }

    public static Date StringToDate(String dateStr,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date date = sdf.parse(dateStr);
        return date;
    }
}
