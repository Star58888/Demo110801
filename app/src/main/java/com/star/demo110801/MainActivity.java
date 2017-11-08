package com.star.demo110801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Map<String , Object>> mylist;
    SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list);
        mylist = new ArrayList<>();
        HashMap<String , Object> m1 =new HashMap<>();
        m1.put("city" , "台北");
        m1.put("code" , "02");
        m1.put("img" , R.drawable.taipei);
        HashMap<String , Object> m2 =new HashMap<>();
        m2.put("city" , "台中");
        m2.put("code" , "04");
        m2.put("img" , R.drawable.tc);
        HashMap<String , Object> m3 =new HashMap<>();
        m3.put("city" , "高雄");
        m3.put("code" , "07");
        m3.put("img" , R.drawable.kh);
        mylist.add(m1);
        mylist.add(m2);
        mylist.add(m3);

        //自訂的
        simpleAdapter = new SimpleAdapter(this,mylist,R.layout.myitem ,
                new String[] {"city" , "code" , "img"} , new int[] {R.id.textView , R.id.textView2 , R.id.imageView});

//        //android裡面有的
//        simpleAdapter = new SimpleAdapter(this,mylist,android.R.layout.simple_list_item_2 ,
//                new String[] {"city" , "code"} , new int[] {android.R.id.text1 , android.R.id.text2});  // text1 , text2 id 是固定的 (simple_list_item_2)
        lv.setAdapter(simpleAdapter);

    }
}
