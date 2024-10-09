package com.minhchien.cafeshopjava.utils;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Utils {


    // Ẩn bàn phím ảo
    public static void hideSoftKeyboard(Activity activity) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.
                    getSystemService(Activity.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }


   // chuan hoa chuoi tim kiem ("Bùi" => "Bui")
    public static String getTextSearch(String input) {
        String nfdNormalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

}
