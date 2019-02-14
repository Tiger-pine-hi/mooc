package com.wjs.mooc.Dao.user;


import com.wjs.mooc.bean.user.UserFollowStudyRecord;
import com.wjs.mooc.bean.user.UserFollows;

import java.util.List;

public interface UserFollowsDao {

	/**
	*根据id获取
	**/
	public UserFollows getById(Long id);

	/**
	*获取所有
	**/
	public List<UserFollows> queryAll(UserFollows queryEntity);

	/**
	*获取总数量
	**/
	public Integer getTotalItemsCount(UserFollows queryEntity);

	/**
	*获取总数量
	**/
	public Integer getFollowStudyRecordCount(UserFollowStudyRecord queryEntity);

	/**
	*创建新记录
	**/
	public void createSelectivity(UserFollows entity);

	/**
	*根据id更新
	**/
	public void update(UserFollows entity);

	/**
	*根据id选择性更新自动
	**/
	public void updateSelectivity(UserFollows entity);

	/**
	*物理删除
	**/
	public void delete(UserFollows entity);

	/**
	*逻辑删除
	**/
	public void deleteLogic(UserFollows entity);



}

