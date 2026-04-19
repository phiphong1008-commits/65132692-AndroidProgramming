package dpphong.ntu.bottom_nav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Cau1 extends Fragment {

    EditText edt_m;
    EditText edt_km;
    Button button;
    public Cau1() {
    }

    public static Cau1 newInstance(String param1, String param2) {
        Cau1 fragment = new Cau1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View cau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        edt_m = cau1.findViewById(R.id.edt_1);
        edt_km = cau1.findViewById(R.id.edt_2);
        button = cau1.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String str_m = edt_m.getText().toString();
                 String str_km = edt_km.getText().toString();
                 float temp;
                 float f_m = Float.parseFloat(str_m);
                 float f_km = Float.parseFloat(str_km);

                 if(!str_m.isEmpty()) {
                     temp = f_m / 1000;
                     String str_temp = String.valueOf(temp);
                     Toast.makeText(cau1.getContext(), str_temp + "m -> km", Toast.LENGTH_LONG).show();
                 }
                     else
                {
                    temp = f_km * 1000;
                    String str_temp = String.valueOf(temp);
                    Toast.makeText(cau1.getContext(), str_temp + "km -> m", Toast.LENGTH_LONG).show();
                }

                }
        });
        return cau1;
    }
}