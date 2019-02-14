package com.wjs.mooc.Dao.course;


import com.wjs.mooc.bean.course.Course;

public interface CourseDao {

	/**
	*根据id获取
	**/
	public Course getById(Long id);

	/**
	*获取总数量
	**/
	public Integer getTotalItemsCount(Course queryEntity);

	/**
	*创建新记录
	**/
	public void create(Course entity);
	public void createSelectivity(Course entity);

	/**
	*根据id更新
	**/
	public void update(Course entity);

	/**
	*根据id选择性更新自动
	**/
	public void updateSelectivity(Course entity);

	/**
	*物理删除
	**/
	public void delete(Course entity);

	/**
	*逻辑删除
	**/
	public void deleteLogic(Course entity);



}

