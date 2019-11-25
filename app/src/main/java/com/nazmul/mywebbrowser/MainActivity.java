package com.nazmul.mywebbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etxtUrl;
    Button btnGo,btnFB,btnYoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etxtUrl = findViewById(R.id.etxt_url);
        btnGo = findViewById(R.id.btn_go);
        btnYoutube=findViewById(R.id.btn_youtube);
        btnFB = findViewById(R.id.btn_fb);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = etxtUrl.getText().toString().trim();

                if (url.isEmpty()){
                    etxtUrl.setError("Please Input URL");
                    etxtUrl.requestFocus();


                }
                else {
                    Intent intent = new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);

                }
            }
        });


        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url","www.facebook.com");
                    startActivity(intent);

                }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.Youtube.com");
                startActivity(intent);

            }
        });

    }
}
