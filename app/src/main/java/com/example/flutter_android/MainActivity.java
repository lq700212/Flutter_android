package com.example.flutter_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;
    private Button btn_flutter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_flutter = findViewById(R.id.btn_flutter);
        btn_flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(FlutterActivity.createDefaultIntent(MainActivity.this));
                startActivity(FlutterActivity
                        .withCachedEngine("my_engine_id")
                        .build(MainActivity.this));
            }
        });
    }
}
