package com.javacookies.springr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // In your activity or fragment, create a RecyclerView and set its adapter and layout manager
        RecyclerView recyclerView = findViewById(R.id.recycler);
// create some dummy data for testing
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("https://media.cntraveller.com/photos/611bf0b8f6bd8f17556db5e4/4:3/pass/gettyimages-1146431497.jpg", "What a nice view!","https://styles.redditmedia.com/t5_7z5meo/styles/profileIcon_hz0srn6mejka1.jpg?width=256&height=256&crop=256:256,smart&v=enabled&s=a5b3f0d6aa33272658bbe3e1189a0446f5aa49dd","Amoguas", false));
        itemList.add(new Item("https://wompampsupport.azureedge.net/fetchimage?siteId=7716&url=https%3A%2F%2Fwww.cancer.org%2Fcontent%2Fdam%2Fcancer-org%2Fimages%2Fphotographs%2Fsingle-use%2Fespresso-coffee-cup-with-beans-on-table-restricted.jpg%2Fjcr%3Acontent%2Frenditions%2Faem-thumbnail-600-600.jpeg", "Having the best time at home","https://static.wikia.nocookie.net/pizzatower/images/a/a4/Gustav_idleeeeelelellele.gif/revision/latest?cb=20200710035024","Gustavo", true));
        itemList.add(new Item("https://i.redd.it/5hb7linpd5w91.png", "Ported my cattppucin setup to Qtile!","https://styles.redditmedia.com/t5_2sx2i/styles/communityIcon_7fixeonxbxd41.png?width=256&v=enabled&s=09e1c0d643c91e5dada2c7f73adb4effdb0bdf7d","r/UnixPorn", false));
// create an adapter with the data
        ItemAdapter adapter = new ItemAdapter(itemList);
// set the adapter to the recycler view
        recyclerView.setAdapter(adapter);
// create a layout manager of your choice
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
// set the layout manager to the recycler view
        recyclerView.setLayoutManager(layoutManager);
    }
}