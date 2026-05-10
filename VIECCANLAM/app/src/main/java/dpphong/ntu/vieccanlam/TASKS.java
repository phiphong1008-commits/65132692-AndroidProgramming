package dpphong.ntu.vieccanlam;

import java.util.HashMap;


public class TASKS {
    String name;
    String date;
    String message;
    String priority;
    public TASKS() {
        // Để trống thế này là được
    }
    public TASKS(String name, String date, String message, String priority) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public HashMap<String,String> toFirebaseOB(){
        HashMap<String,String> taskOb = new HashMap<String,String>();
        taskOb.put("name",name);
        taskOb.put("priority",priority);
        taskOb.put("date",date);
        taskOb.put("message",message);
        return taskOb;
    }

}
