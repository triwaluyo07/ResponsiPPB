package com.example.aplikasimenumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class makananAdapter extends RecyclerView.Adapter<makananAdapter.makananViewHolder>
{
    private ArrayList<makanan> dataList;
    //getcontext
    private Context mcon;
    public makananAdapter(Context con, ArrayList<makanan> dataList){
        mcon = con;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public makananAdapter.makananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_makanan, parent, false);
        return new makananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull makananAdapter.makananViewHolder holder, final int position) {
        holder.txtNama.setText(dataList.get(position).getTitle());
        holder.txtHrg.setText(dataList.get(position).getPrice());
        holder.gambar.setImageResource(mcon.getResources().getIdentifier(dataList.get(position).getImage(), "drawable", mcon.getPackageName()));
        //add onclick (set itemview as onclick)
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] mydata = {dataList.get(position).getTitle(), dataList.get(position).getDesk(),
                        dataList.get(position).getPrice(), dataList.get(position).getImage()};
                Intent detail = new Intent(mcon, Main2Activity.class);
                detail.putExtra("MYDATA", mydata);
                mcon.startActivity(detail);
            }
        });

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class makananViewHolder extends RecyclerView.ViewHolder
    {
        private TextView txtNama,  txtHrg;
        private ImageView gambar;
        public makananViewHolder(View itemView){
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txtNamaMakanan);
            txtHrg = (TextView) itemView.findViewById(R.id.txtHrgMakanan);
            gambar = (ImageView) itemView.findViewById(R.id.GbrCard);
        }
    }
}

