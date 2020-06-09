package com.example.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.example.R;
import com.example.example.model.Data;
import com.example.example.presenter.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Button Insertbtn;
    private Button Removebtn;
    private EditText Insertedt;
    private EditText Removeedt;
    private ArrayList<Data> mItemList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        create();
        initRecyclerview();

        Insertbtn = (Button)findViewById(R.id.insert);
        Removebtn = (Button)findViewById(R.id.remove);

        Insertedt= (EditText)findViewById(R.id.edit_text1);
        Removeedt = (EditText)findViewById(R.id.edit_text2);

        Insertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(Insertedt.getText().toString());
                InsertItem(position);



            }
        });

        Removebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(Removeedt.getText().toString());
                RemoveItem(position);


            }
        });






    }

    public void InsertItem(int position)
    {
        mItemList.add(position,new Data(R.drawable.ic_baseline_attach_file_24,"Data" + position));
        mAdapter.notifyItemInserted(position);
    }

    public void RemoveItem(int position)
    {
        mItemList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }



    public void create()
    {
        mItemList = new ArrayList<>();
        mItemList.add(new Data(R.drawable.ic_baseline_attach_file_24,"Name_1"));
        mItemList.add(new Data(R.drawable.ic_baseline_attach_file_24,"Name_2"));
        mItemList.add(new Data(R.drawable.ic_baseline_attach_file_24,"Name_3"));

    }

    public void initRecyclerview()
    {
        mRecyclerView =findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mAdapter = new Adapter(mItemList);
        mRecyclerView.setAdapter(mAdapter);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }


}