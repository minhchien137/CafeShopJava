package com.minhchien.cafeshopjava.listener;

import com.minhchien.cafeshopjava.model.Voucher;


public interface IOnAdminManagerVoucherListener {
    void onClickUpdateVoucher(Voucher voucher);
    void onClickDeleteVoucher(Voucher voucher);
}
