package vn.poly.tranningandroid.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vn.poly.tranningandroid.R;

public class MonAnAdapter extends BaseAdapter {

    Context myContext;
    int myLayout;
    List<MonAn> arrayMonAn;

    public MonAnAdapter(Context myContext, int myLayout, List<MonAn> arrayMonAn) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.arrayMonAn = arrayMonAn;
    }

    @Override
    public int getCount() {
        return arrayMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        TextView txtTen = (TextView) convertView.findViewById(R.id.name);
            txtTen.setText(arrayMonAn.get(position).Ten);

        TextView txtGia = (TextView) convertView.findViewById(R.id.price);
        txtGia.setText(arrayMonAn.get(position).Gia+ "");

        ImageView txtHinh = (ImageView) convertView.findViewById(R.id.imgage_View);
        txtHinh.setImageResource(arrayMonAn.get(position).Hinh);

        return convertView;
    }
}
