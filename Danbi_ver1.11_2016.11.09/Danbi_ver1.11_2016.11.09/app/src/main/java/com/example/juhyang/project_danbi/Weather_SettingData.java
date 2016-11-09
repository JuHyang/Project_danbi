package com.example.juhyang.project_danbi;

import com.orm.SugarRecord;

/**
 * Created by user on 2016-02-27.
 */
public class Weather_SettingData extends SugarRecord {
    double latitude;
    double longitude;

    public Weather_SettingData() {}

    public Weather_SettingData(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }


}