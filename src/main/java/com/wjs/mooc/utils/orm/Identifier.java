package com.wjs.mooc.utils.orm;

import java.io.Serializable;


/**
 * 序列化接口：使id具有序列化特征
 * @param <KEY>
 */
public interface Identifier<KEY extends Serializable> {

	public KEY getId(); 
	
}
