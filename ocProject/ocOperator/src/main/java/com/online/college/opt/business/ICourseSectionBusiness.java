package com.online.college.opt.business;

import com.online.college.opt.vo.CourseSectionVO;

import java.io.InputStream;
import java.util.List;

public interface ICourseSectionBusiness {

	/**
	 * 批量添加
	 * @param courseSections
	 */
	void batchAdd(List<CourseSectionVO> courseSections);

	/**
	 * 批量导入
	 */
	void batchImport(Long courseId, InputStream is);

}
