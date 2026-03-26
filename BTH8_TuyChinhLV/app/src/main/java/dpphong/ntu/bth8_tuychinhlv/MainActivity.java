package dpphong.ntu.bth8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

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

        ListView lv =  (ListView) findViewById(R.id.lv_ds);

        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        MonAn m1 = new MonAn("Cơm tấm sườn",25000,"Mô tả ở đây", R.drawable.com_tam);
        MonAn m2 = new MonAn("Cơm tấm sườn trứng",27000,"Mô tả ở đây", R.drawable.suontrung);
        MonAn m3 = new MonAn("Cơm tấm gà xối mỡ",30000,"Mô tả ở đây", R.drawable.com_ga);
        MonAn m4 = new MonAn("Cơm tấm sườn bì chả",35000,"Mô tả ở đây", R.drawable.suon_bi);
        MonAn m5 = new MonAn("Cơm tấm đặc biệt",50000,"Mô tả ở đây", R.drawable.dacbiet);
        dsMonAn.add(m1);
        dsMonAn.add(m2);
        dsMonAn.add(m3);
        dsMonAn.add(m4);
        dsMonAn.add(m5);
        MonAnApdapter apdapter = new MonAnApdapter(this,dsMonAn);
        lv.setAdapter(apdapter);

        //Bắt xử lý sự kiện
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAnChon = dsMonAn.get(position);

                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}