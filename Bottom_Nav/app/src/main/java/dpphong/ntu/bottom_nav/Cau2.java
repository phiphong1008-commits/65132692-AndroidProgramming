package dpphong.ntu.bottom_nav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau2 extends Fragment {


    public Cau2() {
        // Required empty public constructor
    }


    public static Cau2 newInstance(String param1, String param2) {
        Cau2 fragment = new Cau2();
        Bundle args = new Bundle();

        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cau2, container, false);
    }
}