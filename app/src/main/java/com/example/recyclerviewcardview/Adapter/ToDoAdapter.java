package com.example.recyclerviewcardview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcardview.MainActivity;
import com.example.recyclerviewcardview.Models.TaskModel;
import com.example.recyclerviewcardview.R;

import java.util.ArrayList;
import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    public List<TaskModel> todolist;
    public MainActivity activity;

            public ToDoAdapter(MainActivity activity, ArrayList<TaskModel> tasks)
    {
        this.activity = activity;
        this.todolist = tasks;
    }


    @Override
    public ToDoAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ToDoAdapter.ViewHolder holder ,int position)
    {
        TaskModel todoitem = todolist.get(position);
        holder.task.setText(todoitem.getTask());
        holder.task.setChecked(toboolean(todoitem.getStatus()));
    }

    public int getItemCount()
    {
        return todolist.size();
    }


     public boolean toboolean(int n)
     {
         return n==1;
     }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox task;

        public ViewHolder(View itemView)
        {
            super(itemView);
            task = itemView.findViewById(R.id.task);
        }
    }

}
