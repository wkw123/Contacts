package com.example.administrator.contacts;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

import static com.example.administrator.contacts.CantactsConstant.CANTACTNAME;
import static com.example.administrator.contacts.CantactsConstant.CANTACTNUMBER;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter adapter;
    private List<Map<String, String>> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new SimpleAdapter(this, dataList, R.layout.item, new String[]{CANTACTNAME,CANTACTNUMBER}, new int[]{R.id.tvname, R.id.tvnum});
        listView.setAdapter(adapter);
    }
}
