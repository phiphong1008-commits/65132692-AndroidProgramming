package dpphong.ntu.vieccanlam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ItemTaskHolder> {
    Context context;
    ArrayList<TASKS> lstData;

    public TaskAdapter(Context context, ArrayList<TASKS> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemTaskHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item, parent, false);
        ItemTaskHolder viewholderCreate = new ItemTaskHolder(vItem);
        return viewholderCreate;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemTaskHolder holder, int position) {
        // Lấy đối tượng hiển thị
        TASKS taskHienThi = lstData.get(position);

        // Trích thông tin tên
        String ten = taskHienThi.getName();

        // Đặt vào trường thông tin của holder
        holder.tvName.setText("Công việc: " + ten);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemTaskHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName; // Chỉ còn lại 1 TextView này

        public ItemTaskHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvTaskName);

            // Lắng nghe sự kiện click trên toàn bộ item
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int viTriDuocClick = getBindingAdapterPosition();
            TASKS phantuDuocClick = lstData.get(viTriDuocClick);

            // Bóc thông tin tên
            String tenCongViec = phantuDuocClick.getName();

            // Toast thông báo
            String thongbao = "Bạn vừa Click vào công việc: " + tenCongViec;
            Toast.makeText(v.getContext(), thongbao, Toast.LENGTH_SHORT).show();
        }
    }
}