package com.example.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcardview.Adapter.ToDoAdapter;
import com.example.recyclerviewcardview.Models.TaskModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<TaskModel> tasks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getActionBar().hide();
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);

        tasks= new ArrayList<>();
        tasks.add(new TaskModel(1,0,"gym at 6pm"));
        tasks.add(new TaskModel(1,0,"gym arfghtht 6pm"));
        tasks.add(new TaskModel(1,0,"gym atraght 6pm"));
        tasks.add(new TaskModel(1,0,"gym art esreg6pm"));
        tasks.add(new TaskModel(1,0,"gym atreg 6pm"));
        tasks.add(new TaskModel(1,0,"gym argat 6pm"));
        tasks.add(new TaskModel(1,0,"gym atrhhrgt 6pm"));
        tasks.add(new TaskModel(1,0,"gym at trhrthth ht tyht ytyht hhthtrh ht6pm"));

        ToDoAdapter adapter = new ToDoAdapter(this,tasks);
        recyclerView.setAdapter(adapter);

    }
}