package com.narender.MultiThreadingBasics.ThreadCoopration;

public class ObjectOfTasks {
    private volatile int Value = 100;

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }
}
