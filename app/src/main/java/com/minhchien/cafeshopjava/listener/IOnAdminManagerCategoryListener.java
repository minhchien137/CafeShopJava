package com.minhchien.cafeshopjava.listener;

import com.minhchien.cafeshopjava.model.Category;


public interface IOnAdminManagerCategoryListener {
    void onClickUpdateCategory(Category category);
    void onClickDeleteCategory(Category category);
    void onClickItemCategory(Category category);
}
