package com.neumiiller.simple_activity_result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class ResultActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent data = new Intent();
        data.putExtra("extra-key", "extra-value");

        setResult(RESULT_OK, data);
        finish();
    }
}
