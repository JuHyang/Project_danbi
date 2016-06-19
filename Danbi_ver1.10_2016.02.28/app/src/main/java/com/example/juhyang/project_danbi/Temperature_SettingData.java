package com.example.juhyang.project_danbi;

import com.orm.SugarRecord;

/**
 * Created by JuHyang on 2016-02-12.
 */
public class Temperature_SettingData extends SugarRecord {
    int temperature;
    int humidity;

    public Temperature_SettingData() {}

    public Temperature_SettingData(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }



}
