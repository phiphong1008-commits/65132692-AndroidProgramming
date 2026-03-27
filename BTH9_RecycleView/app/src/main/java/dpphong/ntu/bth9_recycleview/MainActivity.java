package dpphong.ntu.bth9_recycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeApdapter landScapeApdapter;
    ArrayList<LandScape> recycleviewData;
    RecyclerView recyclerviewLandscape;
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

        recycleviewData = getDataForRecycleView();
        //b4 tim dieu khien

        recyclerviewLandscape = findViewById(R.id.recycle_view);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerviewLandscape.setLayoutManager(layoutLinear);
        landScapeApdapter = new LandScapeApdapter(this,recycleviewData);
        recyclerviewLandscape.setAdapter(landScapeApdapter);
    }
    ArrayList<LandScape> getDataForRecycleView(){
        ArrayList<LandScape> dsdulieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("thaptramhuong","Tháp Không Hương");
        dsdulieu.add(landScape1);
        dsdulieu.add(new LandScape("halongbay","Vịnh Hạ Long Bay"));
        dsdulieu.add(new LandScape("kimtuthap","Kim tự tháp"));
        return dsdulieu;
    }
}