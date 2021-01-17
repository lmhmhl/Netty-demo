package com.waylau.java.demo.reactor.basic;

import java.io.IOException;

/**
 * Basic Reactor Demo
 * 
 * @since 1.0.0 2020年11月14日
 * @author LMH
 */
public class BasicReactorDemo {

	public static void main(String[] args) throws IOException {
		new Thread(new Reactor(2333)).start();
	}

}
