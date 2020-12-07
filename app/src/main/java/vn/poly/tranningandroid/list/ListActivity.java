package vn.poly.tranningandroid.list;

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

public class ListActivity extends AppCompatActivity {

    ArrayList<String> list;
    ListView ListView;
    Button btnAdd;
    EditText edtNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView = findViewById(R.id.ListView);
        btnAdd = findViewById(R.id.btnAdd);
        edtNhap = findViewById(R.id.edt_Nhap);

        list = new ArrayList<>();
        list.add("iphone1");
        list.add("iphone2");
        list.add("iphone3");
        list.add("iphone4");
        list.add("iphone5");
        list.add("iphone6");

        final ArrayAdapter adapter = new ArrayAdapter(ListActivity.this,android.R.layout.simple_list_item_1,list);
        ListView.setAdapter(adapter);
        }

    }