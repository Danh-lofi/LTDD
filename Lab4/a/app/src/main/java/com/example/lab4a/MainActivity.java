package com.example.lab4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listSP;
    int[] imgs = {R.drawable.ca_nau_lau,R.drawable.ga_bo_toi,R.drawable.xa_can_cau,R.drawable.do_choi_dang_mo_hinh,R.drawable.lanh_dao_gian_don,R.drawable.hieu_long_con_tre};
    ImageView myImg;
    CustomArrayAdapter customArrayAdapter;
    ArrayList<SanPham> lvSanPham = new ArrayList<>();
    SanPham sp1 = new SanPham(imgs[0],"Ca nấu lẩu, nấu mì mini","ShopDevang");
    SanPham sp2 = new SanPham(imgs[1],"1KG KHÔ GÀ BƠ TỎI","LTD Food");
    SanPham sp3 = new SanPham(imgs[2],"Xe cần cẩu đa năng","Thế giới đồ chơi");
    SanPham sp4 = new SanPham(imgs[3],"Đồ chơi dạng mô hình","Thế giới đồ chơi");
    SanPham sp5 = new SanPham(imgs[4],"Lãnh đạo đơn giản","Minh Long Book");
    SanPham sp6 = new SanPham(imgs[5],"Hiểu lòng con trẻ","Minh Long Book");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImg = findViewById(R.id.imageView);
        listSP = findViewById(R.id.lvSp);
        TextView tvTenSp = findViewById(R.id.tv_tensp);
        TextView tvTenShop = findViewById(R.id.tv_shop);
        lvSanPham.add(sp1);
        lvSanPham.add(sp2);
        lvSanPham.add(sp3);
        lvSanPham.add(sp4);
        lvSanPham.add(sp5);
        lvSanPham.add(sp6);
        customArrayAdapter = new CustomArrayAdapter(MainActivity.this,R.layout.listlayout,lvSanPham);
        listSP.setAdapter(customArrayAdapter);
    }
}