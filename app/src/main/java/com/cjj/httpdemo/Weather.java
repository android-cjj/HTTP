package com.cjj.httpdemo;


public class Weather {
    public int errNum;
    public String errMsg;


    public Weather() {
    }

    public Weather(int errNum, String errMsg) {
        this.errNum = errNum;
        this.errMsg = errMsg;
    }
}
