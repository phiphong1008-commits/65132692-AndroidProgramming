package thigk2.doanphiphong;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class Cau3 extends Fragment {

    RecyclerView rvNhaTrang;
    NhaTrangAdapter ntAdapter;
    ArrayList<LandScapeNT> listNT;

    public Cau3() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau3, container, false);

        // 1. Tìm Recyclerview trong fragment_cau3.xml
        rvNhaTrang = view.findViewById(R.id.rv_nhatrang);

        // 2. Thiết lập LayoutManager
        rvNhaTrang.setLayoutManager(new LinearLayoutManager(getContext()));

        // 3. Chuẩn bị dữ liệu
        listNT = new ArrayList<>();
        listNT.add(new LandScapeNT("thapba", "Tháp Bà Ponagar", "Đường 2/4, Vĩnh Phước"));
        listNT.add(new LandScapeNT("honchong", "Hòn Chồng", "Vĩnh Phước, Nha Trang"));
        listNT.add(new LandScapeNT("vinpearl", "VinWonders", "Đảo Hòn Tre"));
        listNT.add(new LandScapeNT("chualongson", "Chùa Long Sơn", "20 Đường 23/10"));
        listNT.add(new LandScapeNT("nhathonui", "Nhà thờ Núi", "01 Thái Nguyên"));

        // 4. Đổ vào Adapter
        ntAdapter = new NhaTrangAdapter(getContext(), listNT);
        rvNhaTrang.setAdapter(ntAdapter);

        return view;
    }
}