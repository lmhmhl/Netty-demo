package com.lmh.netty.demo.echo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class EchoServerHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		System.out.println(ctx.channel().remoteAddress() + " -> Server :" + msg);
		ctx.write(msg);// 写消息到管道，队列
		ctx.flush(); // 冲刷消息到socket
		//ctx.writeAndFlush(msg);
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		// 当出现异常就关闭连接
		cause.printStackTrace();
		ctx.close();
	}
}