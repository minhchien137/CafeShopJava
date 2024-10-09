package com.minhchien.cafeshopjava.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeUtils {
    private static final String DEFAULT_FORMAT_DATE = "dd-MM-yyyy, hh:mm a";


    // 24h -> 12h (AM,PM)
    public static String parseTimeFormat(String time) {
        String inputPattern = "HH:mm";
        String outputPattern = "hh:mm a";
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern, Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern, Locale.ENGLISH);

        Date date;
        String str = null;

        try {
            date = inputFormat.parse(time);
            if (date != null) {
                str = outputFormat.format(date);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str;
    }

    // chuyen doi dau thoi gian Unix -> chuoi ngay va gio
    public static String convertTimeStampToDate(long timeStamp) {
        String result = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT_DATE, Locale.ENGLISH);
            Date date = (new Date(timeStamp));
            result = sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
