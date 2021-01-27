package com.lmh.netty.demo.buffer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * ByteBuf Demo.
 * @since 1.0.0 2020年10月7日
 * @author LMH
 */
public class ByteBufDemo {

	public static void main(String[] args) {
		// 创建一个缓冲区
		ByteBuf buffer = Unpooled.buffer(10);
		System.out.println("------------初始时缓冲区------------");
		printBuffer(buffer);
		// 添加一些数据到缓冲区中
		System.out.println("------------添加数据到缓冲区------------");
		String s = "love";
		buffer.writeBytes(s.getBytes());
		printBuffer(buffer);
		// 读取数据
		System.out.println("------------读取数据------------");
		while (buffer.isReadable()) {
			System.out.println(buffer.readByte());
		}
		printBuffer(buffer);
		// 执行compact，清除掉已经读到的字节，可读字节移动到数组的开始位置
		System.out.println("------------执行discardReadBytes------------");
		buffer.discardReadBytes();
		printBuffer(buffer);
		// 执行clear
		System.out.println("------------执行clear清空缓冲区------------");
		buffer.clear();
		printBuffer(buffer);
	}

	private static void printBuffer(ByteBuf buffer) {
		System.out.println("readerIndex：" + buffer.readerIndex());
		System.out.println("writerIndex：" + buffer.writerIndex());
		System.out.println("capacity：" + buffer.capacity());
	}
}
