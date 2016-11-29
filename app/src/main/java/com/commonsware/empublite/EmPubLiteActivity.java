package com.commonsware.empublite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EmPubLiteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView tx = (TextView) findViewById(R.id.text1);


    }
}
