package vn.poly.tranningandroid.vonglap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import vn.poly.tranningandroid.R;
import vn.poly.tranningandroid.list.ListActivity;

public class VongLapActivity extends AppCompatActivity {

    ArrayList<String> list;
    android.widget.ListView ListView;
    Button btnAdd;
    EditText edtNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vong_lap);

        ListView = findViewById(R.id.ListView);
        btnAdd = findViewById(R.id.btnAdd);
        edtNhap = findViewById(R.id.edt_Nhap);

        list = new ArrayList<>();
        list.add("iphone1");
        list.add("iphone2");
        list.add("iphone3");

        final ArrayAdapter adapter = new ArrayAdapter(VongLapActivity.this,android.R.layout.simple_list_item_1,list);
        ListView.setAdapter(adapter);

    }
    }
