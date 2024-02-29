package com.narender.KafkaUtil.KafkaUtility.Event;

import java.io.Serializable;

public class Event implements Serializable {
    private String UserName;
    private int RollNo;
    private String branch;

    public Event(String userName, int rollNo) {
        UserName = userName;
        RollNo = rollNo;
        if((rollNo&1) == 0) this.branch = "Comp";
        else this.branch = "Mech";
    }

    @Override
    public String toString() {
        return "Event{" +
                "UserName='" + UserName + '\'' +
                ", RollNo=" + RollNo +
                ", branch='" + branch + '\'' +
                '}';
    }
}
