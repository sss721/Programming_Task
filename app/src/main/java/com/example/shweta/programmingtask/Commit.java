package com.example.shweta.programmingtask;

/**
 * Created by Shweta on 9/7/2016.
 */
public class Commit {
    private String name;
    private String commit_Version;
    private String commit_Message;


    public Commit() {
    }

    public Commit(String name, String commit_Version, String commit_Message) {
        this.name = name;
        this.commit_Version = commit_Version;
        this.commit_Message = commit_Message;

    }


    public String getCommit_Version() {
        return commit_Version;
    }

    public void setCommit_Version(String commit_Version) {
        this.commit_Version = commit_Version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommit_Message() {
        return commit_Message;
    }

    public void setCommit_Message(String commit_Message) {
        this.commit_Message = commit_Message;
    }



}
