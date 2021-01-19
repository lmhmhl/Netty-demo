package com.lmh.netty.demo.encoder;

/**
 * Message Type.
 * 
 * @since 1.0.0 2020年12月16日
 * @author LMH
 */
public enum MsgType {
	EMGW_LOGIN_REQ((byte) 0x00), 
	EMGW_LOGIN_RES((byte) 0x01);

	private byte value;

	public byte getValue() {
		return value;
	}

	private MsgType(byte value) {
		this.value = value;
	}
}
