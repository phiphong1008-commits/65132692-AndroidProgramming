package ntu.edu.bth7;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dstentinh;
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

//B1 tạo dữ liệu

        dstentinh = new ArrayList<>();
        dstentinh.add("Hà Nội");
        dstentinh.add("Hồ Chí Minh");
        dstentinh.add("Nha Trang");
        dstentinh.add("Đà Nẵng");
        dstentinh.add("Đà Lạt");
        dstentinh.add("Phan Thiết");
        //B2 tạo adapter
        ArrayAdapter<String> arrayadapter;
        arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dstentinh);


        //B3 gắm vào điều khiển hiển thị Listview
        //3.1
        ListView lvtinhthanh = findViewById(R.id.lvdsxml);
        lvtinhthanh.setAdapter(arrayadapter);


        lvtinhthanh.setOnItemClickListener(BoXuLyList);
    }

    AdapterView.OnItemClickListener BoXuLyList = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String strTen = dstentinh.get(position);
            Toast.makeText(MainActivity.this,"Bạn đã chọn " + strTen,Toast.LENGTH_LONG).show();
        }
    };
}