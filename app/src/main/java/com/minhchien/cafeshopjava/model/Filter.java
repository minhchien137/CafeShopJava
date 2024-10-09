package com.minhchien.cafeshopjava.model;

public class Filter {
    public static final int TYPE_FILTER_ALL = 1;
    public static final int TYPE_FILTER_RATE = 2;
    public static final int TYPE_FILTER_PRICE = 3;
    public static final int TYPE_FILTER_PROMOTION = 4;

    private int id;
    private String name;
    private boolean isSelected;

    public Filter(int id, String name, boolean isSelected) {
        this.id = id;
        this.name = name;
        this.isSelected = isSelected;
    }

    public Filter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
