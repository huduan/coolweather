package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by huduan on 2017/10/30.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceId;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
