package com.example.bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private RecyclerView rvPhepTinhs;
//    private ThiAdapter mPhepTinhAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button htd = findViewById(R.id.htd);
        Button httd = findViewById(R.id.httd);
        Button qkd = findViewById(R.id.qkd);
        Button qktd = findViewById(R.id.qktd);
        Button tld = findViewById(R.id.tld);
        Button tlg = findViewById(R.id.tlg);

        List<Button> btn_list = new ArrayList<>();
        btn_list.add(htd);
        btn_list.add(httd);
        btn_list.add(qkd);
        btn_list.add(qktd);
        btn_list.add(tld);
        btn_list.add(tlg);


        for (Button btn : btn_list) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    String thi = String.valueOf(btn.getText());
                    intent.putExtra("thi", thi);


                    startActivity(intent);
                }
            });

        }

//        rvPhepTinhs = (RecyclerView)findViewById(R.id.rv_pheptinh);
//        // Create song data
//        mPhepTinhs = new ArrayList<>();
//
//        mPhepTinhs.add(new PhepTinh("+"));
//        mPhepTinhs.add(new PhepTinh("-"));
//        mPhepTinhs.add(new PhepTinh("*"));
//        mPhepTinhs.add(new PhepTinh("/"));
//        mPhepTinhs.add(new PhepTinh("Lũy thừa"));
//        mPhepTinhs.add(new PhepTinh("Logarit"));
//        mPhepTinhAdapter = new ThiAdapter(this,  mPhepTinhs);
//        rvPhepTinhs.setAdapter(mPhepTinhAdapter);
//
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        rvPhepTinhs.setLayoutManager(gridLayoutManager);


    }
}