package com.example.bth4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }
    public void Cong(View view)
    {
        EditText edtso1 = findViewById(R.id.edt_1);
        EditText edtso2 = findViewById(R.id.edt_2);
        EditText edtKQ  = findViewById(R.id.edt_kq);

        String str_a = edtso1.getText().toString();
        String str_b = edtso2.getText().toString();

        int a = Integer.parseInt(str_a);
        int b = Integer.parseInt(str_b);

        int ketqua = a + b;
        String strkq = String.valueOf(ketqua);
        edtKQ.setText(strkq);
    }

    public void Tru(View view)
    {
        EditText edtso1 = findViewById(R.id.edt_1);
        EditText edtso2 = findViewById(R.id.edt_2);
        EditText edtKQ = findViewById(R.id.edt_kq);

        String str_a = edtso1.getText().toString();
        String str_b = edtso2.getText().toString();

        int a = Integer.parseInt(str_a);
        int b = Integer.parseInt(str_b);

        int ketqua = a - b;
        String strkq = String.valueOf(ketqua);
        edtKQ.setText(strkq);
    }

    public void Nhan(View view)
    {
        EditText edtso1 = findViewById(R.id.edt_1);
        EditText edtso2 = findViewById(R.id.edt_2);
        EditText edtKQ = findViewById(R.id.edt_kq);

        String str_a = edtso1.getText().toString();
        String str_b = edtso2.getText().toString();

        int a = Integer.parseInt(str_a);
        int b = Integer.parseInt(str_b);

        int ketqua = a * b;
        String strkq = String.valueOf(ketqua);
        edtKQ.setText(strkq);
    }

    public void Chia(View view)
    {
        EditText edtso1 = findViewById(R.id.edt_1);
        EditText edtso2 = findViewById(R.id.edt_2);
        EditText edtKQ = findViewById(R.id.edt_kq);

        String str_a = edtso1.getText().toString();
        String str_b = edtso2.getText().toString();

        float a = Integer.parseInt(str_a);
        int b = Integer.parseInt(str_b);

        float ketqua = a / b;
        String strkq = String.valueOf(ketqua);
        edtKQ.setText(strkq);
    }
}