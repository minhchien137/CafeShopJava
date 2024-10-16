package com.minhchien.cafeshopjava.listener;

import com.minhchien.cafeshopjava.model.Topping;


public interface IOnAdminManagerToppingListener {
    void onClickUpdateTopping(Topping topping);
    void onClickDeleteTopping(Topping topping);
}
