package com.lmh.java.demo.reactor.client;

/**
 * Client Demo
 * 
 * @since 1.0.0 2020年11月14日
 * @author LMH
 */
public class ClientDemo {

    public static void main(String[] args) {
        new Thread(new NIOClient("127.0.0.1", 2333)).start();
        new Thread(new NIOClient("127.0.0.1", 2333)).start();
    }

}
