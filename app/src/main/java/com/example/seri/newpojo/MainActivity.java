package com.example.seri.newpojo;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataModel play1=new DataModel("빨간맛", "레드벨벳");
        DataModel play2=new DataModel("Dance The Night Away", "트와이스");
        DataModel play3=new DataModel("더워", "세리");

        ArrayList<DataModel> PlayList = new ArrayList<>();
        PlayList.add(play1);
        PlayList.add(play2);
        PlayList.add(play3);

        Adapter adapter = new Adapter(PlayList, this);

        ListView listView = findViewById(R.id.PlayList);

        listView.setAdapter(adapter);
    }
}
