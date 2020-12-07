package vn.poly.tranningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vn.poly.tranningandroid.list.ListActivity;
import vn.poly.tranningandroid.listadapter.ListAdtActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnList(View view) {
        Intent i = new Intent(MainActivity.this, ListActivity.class);
        startActivity(i);
    }

    public void btnAdapter(View view) {
        Intent i = new Intent(MainActivity.this, ListAdtActivity.class);
        startActivity(i);
    }

}