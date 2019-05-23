package com.ryoua.chapter03.SingleThreadedExecution;

/**
 * @Author ryoua Created on 2019-05-23
 */
public class UserThread extends Thread{
    private final Gate gate;
    private final String myName;
    private final String myAdress;

    public UserThread(Gate gate, String myName, String myAdress) {
        this.gate = gate;
        this.myAdress = myAdress;
        this.myName = myName;
    }

    @Override
    public void run() {
        System.out.println(myName + " begin");
        while (true)
            gate.pass(myName, myAdress);
    }
}
