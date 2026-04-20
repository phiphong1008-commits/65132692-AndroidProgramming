package thigk2.doanphiphong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1 extends Fragment {


    private EditText edtChieuDai, edtChieuRong, edtKetQua;
    private Button btnChuVi, btnDienTich;

    public Cau1() {
        // Required empty public constructor
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

        View view = inflater.inflate(R.layout.fragment_cau1, container, false);


        edtChieuDai = view.findViewById(R.id.edt_1);
        edtChieuRong = view.findViewById(R.id.edt_2);
        edtKetQua = view.findViewById(R.id.edt_3);
        btnChuVi = view.findViewById(R.id.btn_chuvi);
        btnDienTich = view.findViewById(R.id.btn_dientich);


        btnChuVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan(true);
            }
        });


        btnDienTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan(false);
            }
        });

        return view;
    }


    private void tinhToan(boolean laTinhChuVi) {
        String strDai = edtChieuDai.getText().toString();
        String strRong = edtChieuRong.getText().toString();


        if (strDai.isEmpty() || strRong.isEmpty()) {
            Toast.makeText(getContext(), "Vui lòng nhập đầy đủ chiều dài và rộng", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double dai = Double.parseDouble(strDai);
            double rong = Double.parseDouble(strRong);
            double ketQua = 0;

            if (laTinhChuVi) {

                ketQua = (dai + rong) * 2;
            } else {

                ketQua = dai * rong;
            }


            edtKetQua.setText(String.valueOf(ketQua));

        } catch (NumberFormatException e) {
            Toast.makeText(getContext(), "Vui lòng chỉ nhập số", Toast.LENGTH_SHORT).show();
        }
    }
}
