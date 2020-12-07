package vn.poly.tranningandroid.listadapter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import vn.poly.tranningandroid.R;

public class ListAdtActivity extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList<MonAn> mangmongan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        lvMonAn = (ListView) findViewById(R.id.list_View);
        mangmongan = new ArrayList<MonAn>();
        for (int i=1;i<10;i++) {
            mangmongan.add(new MonAn("banh mi", 100000, R.drawable.welcome));
            mangmongan.add(new MonAn("tao", 200000, R.drawable.tao ));
            mangmongan.add(new MonAn("xoai", 300000, R.drawable.xoai ));
        }

        final MonAnAdapter anAdapter = new MonAnAdapter(ListAdtActivity.this,R.layout.monanrow,mangmongan);
        lvMonAn.setAdapter(anAdapter);

        lvMonAn.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListAdtActivity.this,"xoa thanh cong "+ mangmongan.get(position),Toast.LENGTH_LONG).show();
                mangmongan.remove(position);
                anAdapter.notifyDataSetChanged();
                Log.e("click", mangmongan.get(position) +"");
                return false;
            }
        });

        lvMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListAdtActivity.this,"click "+ mangmongan.get(position),Toast.LENGTH_LONG).show();
               anAdapter.notifyDataSetChanged();
                Log.e("click", mangmongan.get(position) +"");
            }
        });
    }
}