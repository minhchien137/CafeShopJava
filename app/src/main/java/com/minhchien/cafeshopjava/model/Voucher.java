package com.minhchien.cafeshopjava.model;

import com.minhchien.cafeshopjava.utils.Constant;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Voucher implements Serializable {

    private long id;
    private int discout;
    private int minium;
    private boolean isSelected;

    public Voucher(long id, int discout, int minium, boolean isSelected) {
        this.id = id;
        this.discout = discout;
        this.minium = minium;
        this.isSelected = isSelected;
    }

    public Voucher() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDiscout() {
        return discout;
    }

    public void setDiscout(int discout) {
        this.discout = discout;
    }

    public int getMinium() {
        return minium;
    }

    public void setMinium(int minium) {
        this.minium = minium;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getMiniumText(){
    if (minium > 0)
    {
        return "Áp dụng cho đơn hàng tối thiểu!! " + minium +  Constant.CURRENCY;
    }
        return "Áp dụng cho mọi đơn hàng!!!";
    }

    public String getCondition(int amount){
        if (minium <= 0) return "";
        int condition = minium - amount;
        if (condition > 0){
            return "Hãy mua thêm " + condition + Constant.CURRENCY + " để nhận được khuyến mại này";
        }
        return  "";
    }

    public boolean isVoucherEnable(int amount){
        if (minium <= 0) return true;
        int condition = minium - amount;
        return condition <= 0;

    }

    public int getPriceDiscount(int amount){
        return (amount * discout) / 100;
    }


}
