package ntu.edu.bth5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtso1, edtso2, edtkq;
    Button nutcong, nuttru, nutnhan, nutchia;
    void TimDieuKhien(){
        edtso1 = (EditText) findViewById(R.id.edt_1);
        edtso2 = (EditText) findViewById(R.id.edt_2);
        edtkq = (EditText) findViewById(R.id.edt_kq);
        nutcong = (Button) findViewById(R.id.btn_cong);
        nuttru = (Button) findViewById(R.id.btn_tru);
        nutnhan = (Button) findViewById(R.id.btn_nhan);
        nutchia = (Button) findViewById(R.id.btn_chia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();

        View.OnClickListener bolangngheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = edtso1.getText().toString();
                String str2 = edtso2.getText().toString();

                float so1 = Float.parseFloat(str1);
                float so2 = Float.parseFloat(str2);

                float kq = so1 + so2;
                String strkq = String.valueOf(kq);
                edtkq.setText(strkq);
            }
        };
        nutcong.setOnClickListener(bolangngheCong);

        nuttru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = edtso1.getText().toString();
                String str2 = edtso2.getText().toString();

                float so1 = Float.parseFloat(str1);
                float so2 = Float.parseFloat(str2);

                float kq = so1 - so2;
                String strkq = String.valueOf(kq);
                edtkq.setText(strkq);
            }
        });

        nutnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = edtso1.getText().toString();
                String str2 = edtso2.getText().toString();

                float so1 = Float.parseFloat(str1);
                float so2 = Float.parseFloat(str2);

                float kq = so1 * so2;
                String strkq = String.valueOf(kq);
                edtkq.setText(strkq);
            }
        });

        nutchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = edtso1.getText().toString();
                String str2 = edtso2.getText().toString();

                float so1 = Float.parseFloat(str1);
                float so2 = Float.parseFloat(str2);

                float kq = so1 / so2;
                String strkq = String.valueOf(kq);
                edtkq.setText(strkq);
            }
        });
    }
}