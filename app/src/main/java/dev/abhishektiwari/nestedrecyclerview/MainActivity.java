package dev.abhishektiwari.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_parent;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass>  favouriteList;
    ArrayList<ChildModelClass>  recentlyWatchedList;
    ArrayList<ChildModelClass>  latestList;
    ArrayList<ChildModelClass>  latestHits;
    ArrayList<ChildModelClass>  popularList;
    private ParentAdapter parentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        rv_parent = findViewById(R.id.rv_parent);

        //initialization of arraylist
        childModelClassArrayList = new ArrayList<>(  );
        favouriteList = new ArrayList<>(  );
        recentlyWatchedList = new ArrayList<>(  );
        latestList = new ArrayList<>(  );
        latestHits = new ArrayList<>();
        popularList = new ArrayList<>();

        parentModelClassArrayList = new ArrayList<>(  );


//        parentModelClassArrayList.add(new ParentModelClass(""))
//
//        latestList.add(new ChildModelClass(R.drawable.imgre));
//        latestList.add(new ChildModelClass(R.drawable.imgre1));
//        latestList.add(new ChildModelClass(R.drawable.imgre2));


        parentModelClassArrayList.add(new ParentModelClass("Latest Movies",latestList));

        latestList.add(new ChildModelClass(R.drawable.imgre));
        latestList.add(new ChildModelClass(R.drawable.imgre1));
        latestList.add(new ChildModelClass(R.drawable.imgre3));
        latestList.add(new ChildModelClass(R.drawable.imgre4));
        latestList.add(new ChildModelClass(R.drawable.imgre5));


        parentModelClassArrayList.add(new ParentModelClass("Favourites",favouriteList));

        favouriteList.add(new ChildModelClass(R.drawable.imgre6));
        favouriteList.add(new ChildModelClass(R.drawable.imgre7));
        favouriteList.add(new ChildModelClass(R.drawable.imgre8));
        favouriteList.add(new ChildModelClass(R.drawable.imgre2));



        parentModelClassArrayList.add(new ParentModelClass("Recently Watched",recentlyWatchedList));

        recentlyWatchedList.add(new ChildModelClass(R.drawable.imgre9));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.imgre10));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.imgre11));
        favouriteList.add(new ChildModelClass(R.drawable.imgre8));


        parentModelClassArrayList.add(new ParentModelClass("Latest Hits",latestHits));

        latestHits.add(new ChildModelClass(R.drawable.imgre12));
        latestHits.add(new ChildModelClass(R.drawable.imgre13));
        latestHits.add(new ChildModelClass(R.drawable.imgre14));
        favouriteList.add(new ChildModelClass(R.drawable.imgre6));
        favouriteList.add(new ChildModelClass(R.drawable.imgre6));


        parentModelClassArrayList.add(new ParentModelClass("Popular",popularList));

        popularList.add(new ChildModelClass(R.drawable.imgre14));

        parentAdapter = new ParentAdapter(parentModelClassArrayList, MainActivity.this);
        rv_parent.setLayoutManager(new LinearLayoutManager(this));
        rv_parent.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();





    }
}