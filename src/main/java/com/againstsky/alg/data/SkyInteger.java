package com.againstsky.alg.data;

import com.againstsky.alg.IntegerAble;

public class SkyInteger implements IntegerAble, Comparable<SkyInteger> {

    Integer val;

    public SkyInteger(Integer val) {
        this.val = val;
    }

    @Override
    public int intVal() {
        return val;
    }

    @Override
    public void setIntVal(int val) {
        this.val = val;
    }


    @Override
    public int compareTo(SkyInteger o) {
        return Integer.compare(val, o.val);
    }
}
