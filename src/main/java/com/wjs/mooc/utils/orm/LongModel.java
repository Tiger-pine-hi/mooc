package com.wjs.mooc.utils.orm;

import java.io.Serializable;

/**
 * 实现Identifier接口和Serializable接口
 */
public class LongModel implements Identifier<Long> ,Serializable{
	private static final long serialVersionUID = 7978917143723588623L;
	
	private Long id;
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}
	
}
