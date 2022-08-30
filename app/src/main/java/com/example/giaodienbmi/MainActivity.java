package com.example.giaodienbmi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText chieuCao, canNang;
    RadioButton rbNam, rbNu;
    Button btnTinhBMI;
    TextView txtChiSo, txtNhanXet;
    double chiSo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chieuCao = findViewById(R.id.chieuCao);
        canNang = findViewById(R.id.canNang);
        rbNam = findViewById(R.id.rbNam);
        rbNu = findViewById(R.id.rbNu);
        btnTinhBMI = findViewById(R.id.btnTinhBMI);
        txtChiSo = findViewById(R.id.txtChiSo);
        txtNhanXet = findViewById(R.id.txtNhanXet);

        //click vào bmi
        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double etChieuCao = Double.parseDouble(chieuCao.getText().toString())/100;
                double etCanNang = Double.parseDouble(canNang.getText().toString())/100;
                chiSo = Math.round((etCanNang/Math.pow(etChieuCao,2))*10.0)/10.0;
                if(rbNam.isChecked()){
                    if(chiSo<18.5){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo>=18.5 && chiSo<=24.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo==25 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo>25 && chiSo <=29.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo >= 30 && chiSo<=34.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo >=35 && chiSo <=39.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo == 40){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }

                }
                else if(rbNu.isChecked()){
                    if(chiSo<18.5){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo>=18.5 && chiSo<=22.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo==23 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo>23 && chiSo <=24.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo >= 25 && chiSo<=29.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo >=30 && chiSo <=39.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiSo == 40){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                }

            }


        });
    }


}