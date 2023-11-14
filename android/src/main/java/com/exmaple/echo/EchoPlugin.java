package com.exmaple.echo;

import android.util.Log;

public class EchoPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
