package com.wjs.mooc.service.consts;


import com.wjs.mooc.bean.consts.ConstsClassify;

import java.util.List;

public interface IConstsClassifyService {

	/**
	*根据id获取
	**/
	public ConstsClassify getById(Long id);

	/**
	*获取所有
	**/
	public List<ConstsClassify> queryAll();
	
	/**
	 * 根据code获取
	 */
	public ConstsClassify getByCode(String code);
	
	/**
	*根据条件动态获取
	**/
	public List<ConstsClassify> queryByCondition(ConstsClassify queryEntity);

	/**
	*创建
	**/
	public void create(ConstsClassify entity);
	
	/**
	 * 创建
	 */
	public void createSelectivity(ConstsClassify entity);

	/**
	*根据id 进行可选性更新
	**/
	public void updateSelectivity(ConstsClassify entity);

	/**
	*物理删除
	**/
	public void delete(ConstsClassify entity);

	/**
	*逻辑删除
	**/
	public void deleteLogic(ConstsClassify entity);



}

