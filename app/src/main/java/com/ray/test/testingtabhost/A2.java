package com.ray.test.testingtabhost;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class A2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView txt = new TextView(this);
        txt.setGravity(Gravity.CENTER); // Setting position of the object "txt"
        txt.setText("Page 2");
        setContentView(txt);
    }

}

