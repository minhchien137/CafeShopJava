package com.minhchien.cafeshopjava.model;

import java.io.Serializable;

public class Topping implements Serializable {

    public static final String VARIANT_ICE = "variant_ice";
    public static final String VARIANT_HOT = "variant_hot";
    public static final String SIZE_REGULAR = "size_regular";
    public static final String SIZE_MEDIUM = "size_medium";
    public static final String SIZE_LARGE = "size_large";
    public static final String SUGAR_NORMAL = "sugar_normal";
    public static final String SUGAR_LESS = "sugar_less";
    public static final String ICE_NORMAL = "ice_normal";
    public static final String ICE_LESS = "ice_less";

    private long id;
    private String name;
    private int price;
    private boolean isSelected;

    public Topping() {
    }

    public Topping(long id, String name, int price, boolean isSelected) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isSelected = isSelected;


    }
}
