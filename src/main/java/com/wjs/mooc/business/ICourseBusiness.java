package com.wjs.mooc.business;


import com.wjs.mooc.vo.CourseSectionVO;

import java.util.List;

public interface ICourseBusiness {

	/**
	 * 获取课程章节
	 */
	List<CourseSectionVO> queryCourseSection(Long courseId);
	
}
