package thigk2.doanphiphong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class NhaTrangAdapter extends RecyclerView.Adapter<NhaTrangAdapter.NT_Holder> {
    Context context;
    ArrayList<LandScapeNT> list;

    public NhaTrangAdapter(Context context, ArrayList<LandScapeNT> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public NT_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_nhatrang, parent, false);
        return new NT_Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NT_Holder holder, int position) {
        LandScapeNT item = list.get(position);
        holder.tvTen.setText(item.getName());
        holder.tvDiaChi.setText(item.getAddress());

        // Tìm ảnh trong drawable theo tên
        int resID = context.getResources().getIdentifier(item.getImageName(), "drawable", context.getPackageName());
        if (resID != 0) {
            holder.ivHinh.setImageResource(resID);
        }
    }

    @Override
    public int getItemCount() { return list.size(); }

    class NT_Holder extends RecyclerView.ViewHolder {
        ImageView ivHinh;
        TextView tvTen, tvDiaChi;

        public NT_Holder(@NonNull View itemView) {
            super(itemView);
            ivHinh = itemView.findViewById(R.id.iv_hinh_nt);
            tvTen = itemView.findViewById(R.id.tv_ten_nt);
            tvDiaChi = itemView.findViewById(R.id.tv_diachi_nt);
        }
    }
}