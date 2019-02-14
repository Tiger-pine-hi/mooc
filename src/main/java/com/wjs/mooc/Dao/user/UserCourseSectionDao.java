package com.wjs.mooc.Dao.user;


import com.wjs.mooc.bean.user.UserCourseSection;

import java.util.List;

public interface UserCourseSectionDao {

	/**
	*根据id获取
	**/
	public UserCourseSection getById(Long id);

	/**
	*获取所有
	**/
	public List<UserCourseSection> queryAll(UserCourseSection queryEntity);

	/**
	 * 获取最新的学习记录
	 */
	public UserCourseSection queryLatest(UserCourseSection queryEntity);
	
	/**
	*获取总数量
	**/
	public Integer getTotalItemsCount(UserCourseSection queryEntity);

	/**
	*创建新记录
	**/
	public void createSelectivity(UserCourseSection entity);

	/**
	*根据id更新
	**/
	public void update(UserCourseSection entity);

	/**
	*根据id选择性更新自动
	**/
	public void updateSelectivity(UserCourseSection entity);

	/**
	*物理删除
	**/
	public void delete(UserCourseSection entity);

	/**
	*逻辑删除
	**/
	public void deleteLogic(UserCourseSection entity);



}

