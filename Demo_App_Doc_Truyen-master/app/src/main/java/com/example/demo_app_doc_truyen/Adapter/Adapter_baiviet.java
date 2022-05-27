package com.example.demo_app_doc_truyen.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo_app_doc_truyen.Model.Comic;
import com.example.demo_app_doc_truyen.R;

import java.util.ArrayList;

public class Adapter_baiviet extends RecyclerView.Adapter<Adapter_baiviet.Viewhollde_baiviet> {
    ArrayList<Comic> comicArrayList ;
    Context context ;

    public Adapter_baiviet(ArrayList<Comic> comicArrayList, Context context) {
        this.comicArrayList = comicArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewhollde_baiviet onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context , R.layout.tab_bai_viet , null);

        return new Viewhollde_baiviet(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhollde_baiviet holder, int position) {
        Comic comic = comicArrayList.get(position) ;
        //
//        public String name;
//        public String logo;
//        public String author;
//        public String decription;
        holder.noidung.setText("nội dung : " + comic.decription);
        holder.tieude.setText("nội dung : " + comic.name);
    }

    @Override
    public int getItemCount() {
        return comicArrayList.size();
    }

    class Viewhollde_baiviet extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView tieude , noidung ;
        public Viewhollde_baiviet(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.imgBaiViet);
            tieude = itemView.findViewById(R.id.itemTenTieuDe) ;
            noidung = itemView.findViewById(R.id.itemTenNoiDung) ;
        }
    }
}


