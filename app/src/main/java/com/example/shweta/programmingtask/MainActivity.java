package com.example.shweta.programmingtask;
;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Commit> commitList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CommitAdapter cAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        cAdapter = new CommitAdapter(commitList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cAdapter);

        prepareMovieData();


    }

    private void prepareMovieData() {
        Commit commit = new Commit("schneems", "71f37ce4893f63da49e4854db945a8ccb0ae3f5c", "call .to_h to avoid using deprecated method");
        commitList.add(commit);
        commit = new Commit("vipulnsward", "e703fc1f40c892771a0c3d81a03e7aa3561ef64a", "Clarify expires_now documentation");
        commitList.add(commit);
        commit = new Commit("y-yagi", "700c55831f993d52dcc1eb301346fbcfd54b82d9", "`ActionController::Parameters#merge` call `HashWithIndifferentAccess#merge`.\n" +
                "In addition, it calls `HashWithIndifferentAccess#update` from\n" +
                "`HashWithIndifferentAccess#merge`,  where it is called the `#to_hash` of argument.\n" +
                "But `ActionController::Parameters#to_hash` is deprecated, warning message is\n" +
                "displayed.\n" +
                "To avoid this, modify to convert object to `Hash`.\n");
        commitList.add(commit);
        commit = new Commit("nateberkopec", "0d1deb31eb2202acc8b2275163bb7440c9458de9", "[ci skip]");
        commitList.add(commit);
        commit = new Commit("vipulnsward", "06658f1d9db580ff570d783db30fd241a041e3b5", "[ci skip] Simply formatting documents");
        commitList.add(commit);
        commit = new Commit("Neodelf", "e0e7047233b3384612a74e04d5b1ea63a72dd5d4", "[ci skip] Simply formatting documents");
        commitList.add(commit);
        commit = new Commit("guilleiguaran", "f55a2431cfd55ad1e9dc92a9bc68a68dc5446f8d", "Revert  [ci skip] Remove duplicate example.");
        commitList.add(commit);
        commit = new Commit("vipulnsward    ", "f55a2431cfd55ad1e9dc92a9bc68a68dc5446f8d", "Revert  [ci skip] Remove duplicate example.");
        commitList.add(commit);
        commit = new Commit("aditya-kapoor ", "cde162bad1d7b2d5d4eec332b1e7dfbe90f9de84", "Revert  [ci skip] Remove duplicate example.");
        commitList.add(commit);
        commit = new Commit("vijaydev  ", "0fdf522611cb162c2eb8ea23a258451c43cd1fde", "Selectively add `li ul, li ol { margin:0 1.5em; }` to subColl as needed");
        commitList.add(commit);
        commit = new Commit("vipulnsward ", "0c91b166e612d8dba0ededec99cfb39b85d31fbb", "Remove the word \"mongrel\" from documents [ci skip]");
        commitList.add(commit);
        commit = new Commit("tricknotes  ", "b9e98d62c24b04937a219285aef69c2a8344beab", "Currently mongrel is not maintained.\n" +
                "And it couldn't be built with any Ruby versions that\n" +
                "supported by Rails.\n" +
                "\n" +
                "It is reasonable to remove the word \"mongrel\" in order to avoid\n" +
                "confusion from newcomer.");
        commitList.add(commit);
        commit = new Commit("fxn ", "1722397f9a63f74bc7ff633895aec7109568a25b", "Fix Remaining Case-In-Assignment Statement Formatting");
        commitList.add(commit);
        commit = new Commit("vipulnsward ", "2e4eb03925ae5854691a4318787e7707358615e8", "Fix Remaining Case-In-Assignment Statement Formatting");
        commitList.add(commit);
        commit = new Commit("SpartaSixZero ", "28426f53492c62e9f301cee9ac7ffafaba32d0da", "Minor grammar fix in engines.md");
        commitList.add(commit);
        commit = new Commit("alexcameron89", "fbccae4d190c91aa689defc2fbf25744b369df05", "Fix Remaining Case-In-Assignment Statement Formatting");
        commitList.add(commit);
        commit = new Commit("pixeltrix", "38fae35d53a029ee5b9c1192cb67ce2aa28f3904", "Remove redundant `!loaded?` condition");
        commitList.add(commit);
        commit = new Commit("matthewd ", "495ef4124e292dcc7062e3e1f04f623053113101", "Remove not used alias method");
        commitList.add(commit);
        commit = new Commit("yui-knk", "0eb1fa97c1d987811acd1d605447fc6eecd1c921", "Remove not used alias method");
        commitList.add(commit);
        commit = new Commit("kamipo ", "9a7409bb2807542226f4ba907c8386647e3c2fd1", "Remove redundant `!loaded?` condition");
        commitList.add(commit);
        commit = new Commit("pixeltrix ", "da33612d0ffd7750b4caebbaeeb9bc2635c14a12", "Move `require \"models/post\"` before `require \"models/comment\"`");
        commitList.add(commit);

        commit = new Commit("pixeltrix  ", "1e282dff07eaaede360512be57a831382236f29c", "use `descendants` to get class that inherited `ActiveJob::Base`");
        commitList.add(commit);

        commit = new Commit("pixeltrix", "51c53e19bfbc34c2b3b748786d8b5cc268de1c51", "Remove unnecessary `query_scope`");
        commitList.add(commit);

        commit = new Commit("vipulnsward", "8065b4531afea08de716bebea01b50ee21a41ecd", "change `Class#descendants` to public API [ci skip]");
        commitList.add(commit);

        commit = new Commit("y-yagi ", "951353e4764f8ca0fbcc6e9c799eb815c612e759", "hange `Class#descendants` to public API [ci skip]");
        commitList.add(commit);


    }
}
