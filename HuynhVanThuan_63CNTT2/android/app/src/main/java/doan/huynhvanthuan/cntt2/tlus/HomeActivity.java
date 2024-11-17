package doan.huynhvanthuan.cntt2.tlus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

//Giao diện chinsh

public class HomeActivity extends AppCompatActivity {
    ListView lvmain;

    ArrayAdapter<String> adapter;
  //  CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        Button btna = findViewById(R.id.btna);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(in);
            }
        });
        Button btnb = findViewById(R.id.btnb);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(in);
            }
        });

    }
}
