package com.lmh.java.demo.reactor.mainsub;

import java.io.IOException;

/**
 * Main Sub Reactor Demo
 * 
 * @since 1.0.0 2020年11月14日
 * @author LMH
 */
public class MainSubReactorDemo {

    public static void main(String[] args) throws IOException {
        new Thread(new Reactor(2333)).start();
    }

}
