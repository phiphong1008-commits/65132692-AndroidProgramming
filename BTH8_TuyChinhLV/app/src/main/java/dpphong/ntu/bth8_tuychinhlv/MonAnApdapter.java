package dpphong.ntu.bth8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnApdapter extends BaseAdapter {


    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public MonAnApdapter(Context context , ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewHienHanh = convertView;
        if(viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.itemmonan,null);
        MonAn monAnHienTai = dsMonAn.get(position);

        //Tim dieu khien
        TextView textView_tenMon = (TextView) viewHienHanh.findViewById(R.id.tv_ten);
        TextView textView_donGia = (TextView) viewHienHanh.findViewById(R.id.tv_dongia);
        TextView textView_moTa = (TextView) viewHienHanh.findViewById(R.id.tv_mota);
        ImageView img = (ImageView) viewHienHanh.findViewById(R.id.anhMon);

        textView_tenMon.setText(monAnHienTai.getTenMonAn());
        textView_donGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_moTa.setText(monAnHienTai.getMoTa());
        img.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;
    }
}
