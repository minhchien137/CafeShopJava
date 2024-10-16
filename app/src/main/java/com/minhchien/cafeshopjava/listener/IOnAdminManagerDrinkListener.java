package com.minhchien.cafeshopjava.listener;

import com.minhchien.cafeshopjava.model.Drink;


public interface IOnAdminManagerDrinkListener {
    void onClickUpdateDrink(Drink drink);
    void onClickDeleteDrink(Drink drink);
}
