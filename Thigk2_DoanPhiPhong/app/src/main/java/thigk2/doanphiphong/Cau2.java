package thigk2.doanphiphong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

// Lưu ý: Đảm bảo bạn đã copy class LandScape và LandScapeAdapter vào package thigk2.doanphiphong
// hoặc import chúng đúng cách.

public class Cau2 extends Fragment {

    // Khai báo các biến điều khiển
    LandScapeAdapter landScapeAdapter; // Sửa lỗi chính tả Apdapter nếu cần
    ArrayList<LandScape> recycleviewData;
    RecyclerView recyclerviewLandscape;

    public Cau2() {
        // Required empty public constructor
    }

    public static Cau2 newInstance(String param1, String param2) {
        Cau2 fragment = new Cau2();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Chuẩn bị dữ liệu ở đây
        recycleviewData = getDataForRecycleView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 1. Inflate layout cho fragment này
        View view = inflater.inflate(R.layout.fragment_cau2, container, false);

        // 2. Tìm điều khiển RecyclerView thông qua đối tượng view
        recyclerviewLandscape = view.findViewById(R.id.recycle_view);

        // 3. Thiết lập LayoutManager
        // Trong Fragment, ta dùng getContext() thay cho "this"
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(getContext());
        recyclerviewLandscape.setLayoutManager(layoutLinear);

        // 4. Thiết lập Adapter
        landScapeAdapter = new LandScapeAdapter(getContext(), recycleviewData);
        recyclerviewLandscape.setAdapter(landScapeAdapter);

        return view;
    }

    // Hàm tạo dữ liệu mẫu
    ArrayList<LandScape> getDataForRecycleView(){
        ArrayList<LandScape> dsdulieu = new ArrayList<LandScape>();
        dsdulieu.add(new LandScape("thaptramhuong","Tháp Trầm Hương"));
        dsdulieu.add(new LandScape("halongbay","Vịnh Hạ Long"));
        dsdulieu.add(new LandScape("kimtuthap","Kim tự tháp Ai Cập"));
        dsdulieu.add(new LandScape("saigon", "Dinh Độc Lập - TP. Hồ Chí Minh"));
        dsdulieu.add(new LandScape("angiang", "Rừng tràm Trà Sư - An Giang"));
        dsdulieu.add(new LandScape("nuthan", "Tượng Nữ thần Tự do - Mỹ"));
        dsdulieu.add(new LandScape("opera", "Nhà hát Opera Sydney - Úc"));
        dsdulieu.add(new LandScape("hoian", "Phố cổ Hội An - Quảng Nam"));
        dsdulieu.add(new LandScape("sapa", "Ruộng bậc thang Sapa - Lào Cai"));
        dsdulieu.add(new LandScape("danang", "Cầu Vàng Bà Nà Hills - Đà Nẵng"));
        return dsdulieu;
    }
}