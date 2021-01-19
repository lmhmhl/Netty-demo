package com.lmh.netty.demo.decoder;

import io.netty.handler.codec.LineBasedFrameDecoder;

/**
 * My LineBasedFrameDecoder.
 * 
 * @since 1.0.0 2020年12月12日
 * @author LMH
 */
public class MyLineBasedFrameDecoder extends LineBasedFrameDecoder {

	private final static int MAX_LENGTH = 1024; // 帧的最大长度

	public MyLineBasedFrameDecoder() {
		super(MAX_LENGTH);
	}

}
