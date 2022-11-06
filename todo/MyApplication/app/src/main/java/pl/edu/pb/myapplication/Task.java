package pl.edu.pb.myapplication;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    public boolean isDone(){
        return done;
    }
    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
