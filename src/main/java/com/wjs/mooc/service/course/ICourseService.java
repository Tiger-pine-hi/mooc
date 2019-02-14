package com.wjs.mooc.service.course;


import com.wjs.mooc.bean.course.Course;

import java.util.List;

/**
 * 课程服务层
 */
public interface ICourseService {

	/**
	*根据id获取
	**/
	public Course getById(Long id);

	/**
	*创建
	**/
	public void createSelectivity(Course entity);

	/**
	*根据id 进行可选性更新
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

