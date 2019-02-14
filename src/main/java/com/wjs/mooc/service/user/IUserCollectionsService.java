package com.wjs.mooc.service.user;


import com.wjs.mooc.bean.user.UserCollections;

import java.util.List;

public interface IUserCollectionsService {

	/**
	*根据id获取
	**/
	public UserCollections getById(Long id);

	/**
	*获取所有
	**/
	public List<UserCollections> queryAll(UserCollections queryEntity);

	/**
	*创建
	**/
	public void createSelectivity(UserCollections entity);

	/**
	*根据id更新
	**/
	public void update(UserCollections entity);

	/**
	*根据id 进行可选性更新
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

