package com.lmh.netty.demo.codec;

import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * My Codec.
 * 
 * @since 1.0.0 2020年12月17日
 * @author LMH
 */
public class MyCodec extends CombinedChannelDuplexHandler<MyDecoder, MyEncoder> {
	public MyCodec() {
		super(new MyDecoder(), new MyEncoder());
	}

}
