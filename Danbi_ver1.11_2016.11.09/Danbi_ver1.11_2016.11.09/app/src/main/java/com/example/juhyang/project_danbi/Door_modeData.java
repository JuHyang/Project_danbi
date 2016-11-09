package com.example.juhyang.project_danbi;

import com.orm.SugarRecord;

/**
 * Created by JuHyang on 2016-02-22.
 */
public class Door_modeData extends SugarRecord {
    boolean mode;


    public Door_modeData() {}

    public Door_modeData(Boolean mode) {
        this.mode = mode;
    }


}
