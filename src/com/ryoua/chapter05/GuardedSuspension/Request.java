package com.ryoua.chapter05.GuardedSuspension;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class Request {
    private final String name;
    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
