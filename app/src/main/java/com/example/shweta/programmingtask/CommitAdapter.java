package com.example.shweta.programmingtask;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shweta on 9/7/2016.
 */
public class CommitAdapter extends RecyclerView.Adapter<CommitAdapter.MyViewHolder> {

    private List<Commit> commitsList;

    public class MyViewHolder extends RecyclerView.ViewHolder
        {
        public TextView name,com,commit_version,com_msg, commit_message;
        public MyViewHolder(View view)
        {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            com = (TextView) view.findViewById(R.id.com);
            com_msg = (TextView) view.findViewById(R.id.com_msg);
            commit_version =(TextView) view.findViewById(R.id.commit_version);
            commit_message = (TextView) view.findViewById(R.id.commit_message);
        }
    }

        public CommitAdapter(List<Commit> commitsList)
        {
            this.commitsList = commitsList;
        }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.commit_listview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Commit commit = commitsList.get(position);
        holder.name.setText(commit.getName());
        holder.commit_version.setText(commit.getCommit_Version());
        holder.commit_message.setText(commit.getCommit_Message());
    }

    @Override
    public int getItemCount() {
        return commitsList.size();
    }


}
