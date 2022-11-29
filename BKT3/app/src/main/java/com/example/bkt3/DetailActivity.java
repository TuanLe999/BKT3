package com.example.bkt3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {


    private RecyclerView rvViDu;
    private ThiAdapter mThiAdapter;
    private static final  List<Thi> thiList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String thi = intent.getStringExtra("thi");

        rvViDu = findViewById(R.id.rv_vidu);

        Button luu = findViewById(R.id.luu);

        Button back = findViewById(R.id.back_btn);

        TextView tenThi_txt = findViewById(R.id.tenThi_txt);

        tenThi_txt.setText(thi);

        EditText vidu_editText = findViewById(R.id.viDu_editText);



        mThiAdapter = new ThiAdapter(this,  thiList);
        rvViDu.setAdapter(mThiAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvViDu.setLayoutManager(linearLayoutManager);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( DetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(vidu_editText.getText()).isEmpty()){
                    Toast.makeText(DetailActivity.this,"Hãy nhập ví dụ trước khi lưu", Toast.LENGTH_SHORT).show();
                }else {
                    String VIDU = String.valueOf(vidu_editText.getText());

                    Thi vidu = new Thi(thi,VIDU);
                    thiList.add(vidu);

                    mThiAdapter.notifyDataSetChanged();

                    Toast.makeText(DetailActivity.this,"Thêm ví dụ thành công", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}