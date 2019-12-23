package ua.edu.sumdu.j2se.ovrutskyi.tasks;

public class Task {
    private String title;
    private int time;
    private boolean active;
    private int starTime;
    private int endTime;
    private int repeatInterval;

    public Task(String title, int time) {
        this.title = title;
        this.time = time;
        if(this.starTime == 0){
            this.starTime = time;
        }
        if(this.endTime == 0){
            this.endTime = time;
        }
    }

    public Task(String title, int startTime, int endTime, int repeatInterval) {
        this.title = title;
        this.starTime = startTime;
        this.time = startTime;
        this.endTime = endTime;
        this.repeatInterval = repeatInterval;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
        if(time > this.endTime){
            this.repeatInterval = 0;
            this.starTime = time;
            this.endTime = time;

        }
    }
    public void setTime(int start, int end, int interval) {
        if(isRepeated()){
            this.repeatInterval = interval;
        }
        this.starTime = start;
        this.time = start;
        this.endTime = end;

    }
    public int getStarTime() {
        return starTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getRepeatInterval() {
        return repeatInterval;
    }

    public boolean isRepeated() {
        return repeatInterval>0;
    }

}
