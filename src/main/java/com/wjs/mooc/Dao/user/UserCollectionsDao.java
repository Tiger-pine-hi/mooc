package com.wjs.mooc.Dao.user;


import com.wjs.mooc.bean.user.UserCollections;

import java.util.List;

public interface UserCollectionsDao {

	/**
	*根据id获取
	**/
	public UserCollections getById(Long id);

	/**
	*获取所有
	**/
	public List<UserCollections> queryAll(UserCollections queryEntity);

	/**
	*获取总数量
	**/
	public Integer getTotalItemsCount(UserCollections queryEntity);

	/**
	*创建新记录
	**/
	public void create(UserCollections entity);
	
	/**
	*创建新记录
	**/
	public void createSelectivity(UserCollections entity);
	
	/**
	*根据id更新
	**/
	public void update(UserCollections entity);

	/**
	*根据id选择性更新自动
	**/
	public void updateSelectivity(UserCollections entity);

	/**
	*物理删除
	**/
	public void delete(UserCollections entity);

	/**
	*逻辑删除
	**/
	public void deleteLogic(UserCollections entity);



}

