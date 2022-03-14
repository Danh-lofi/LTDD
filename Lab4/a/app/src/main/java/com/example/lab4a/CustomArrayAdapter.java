package com.example.lab4a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<SanPham> {
    Context context;
    ArrayList<SanPham> arrayList;
    int layoutResource;

    public CustomArrayAdapter(@NonNull Context context, int resource,ArrayList<SanPham> arrayList) {
        super(context, resource, arrayList);
        this.context = context;
        this.arrayList = arrayList;
        this.layoutResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layoutResource,null);
        TextView tvTenSP = (TextView) convertView.findViewById(R.id.tv_tensp);
        TextView tvTenShop = (TextView) convertView.findViewById(R.id.tv_shop);

        tvTenSP.setText(arrayList.get(position).getTenSp());
        tvTenShop.setText(arrayList.get(position).getTenShop());

        ImageView imgView = (ImageView) convertView.findViewById(R.id.imageView);
        imgView.setImageResource(arrayList.get(position).getIdImg());
        return convertView;
    }
}
