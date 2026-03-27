package dpphong.ntu.bth9_recycleview;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeApdapter extends RecyclerView.Adapter<LandScapeApdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeApdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land,parent,false);
        ItemLandHolder viewholderCreate = new ItemLandHolder(vItem);
        return viewholderCreate;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        // Lay doi tuong hien thi
        LandScape landScapeHIenThi = lstData.get(position);
        // Trich thong tin
        String caption = landScapeHIenThi.getLandCation();
        String tenanh = landScapeHIenThi.getLandImageFileName();
        // Dat vao cac truong thong tin cua holder
        holder.tvcaption.setText(caption);
        // dat anh
        String packagename = holder.itemView.getContext().getPackageName();
        int imageId = holder.itemView.getResources().getIdentifier(tenanh,"mipmap",packagename);
        holder.imgLandscape.setImageResource(imageId);

    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView tvcaption;
            ImageView imgLandscape;
            public ItemLandHolder(@NonNull View itemView) {
                super(itemView);
                tvcaption = itemView.findViewById(R.id.tv_1);
                imgLandscape = itemView.findViewById(R.id.img_land);
                itemView.setOnClickListener(this);
            }

        @Override
        public void onClick(View v) {
            int viTriDuocClick = getBindingAdapterPosition();
            LandScape phantuduocClick = lstData.get(viTriDuocClick);
            //boc thong tin
            String ten = phantuduocClick.getLandCation();
            String tenfile = phantuduocClick.getLandImageFileName();
            // Toast ten
            String thongbao = "Ban vua Click vao " + ten;
            Toast.makeText(v.getContext(),thongbao,Toast.LENGTH_SHORT).show();
        }
    }
}
