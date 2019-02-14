package com.wjs.mooc.service.statics;


import com.wjs.mooc.bean.statics.CourseStudyStaticsDto;
import com.wjs.mooc.bean.statics.StaticsVO;

/**
 * 报表统计
 */
public interface IStaticsService {
	/**
	*统计课程学习情况
	**/
	public StaticsVO queryCourseStudyStatistics(CourseStudyStaticsDto queryEntity);
	
}
