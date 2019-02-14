package com.wjs.mooc.Dao.statics;


import com.wjs.mooc.bean.statics.CourseStudyStaticsDto;

import java.util.List;

public interface CourseStudyStaticsDao {
	
	/**
	*统计课程学习情况
	**/
	public List<CourseStudyStaticsDto> queryCourseStudyStatistics(CourseStudyStaticsDto queryEntity);
	
}

