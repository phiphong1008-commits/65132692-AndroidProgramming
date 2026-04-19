package dpphong.ntu.bottom_nav;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView botnav = findViewById(R.id.bottomNavigationView);
        botnav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment select_frag = null;
                int itemid = menuItem.getItemId();
                if (itemid == R.id.nav_home)
                    select_frag = new Home();
                else if (itemid == R.id.nav_1) {
                    select_frag = new Cau1();
                }
                else if (itemid == R.id.nav_2) {
                    select_frag = new Cau2();
                }
                else if (itemid == R.id.nav_3) {
                    select_frag = new Cau3();
                }else if (itemid == R.id.nav_4) {
                    select_frag = new Cau4();
                }

                if (select_frag != null)
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_welcome,select_frag).commit();
                return true;
            }
        });
    }
}