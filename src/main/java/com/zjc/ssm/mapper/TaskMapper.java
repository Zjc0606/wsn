package com.zjc.ssm.mapper;

import com.zjc.ssm.vo.TaskGY;
import com.zjc.ssm.vo.TaskStdGY;

import java.util.List;

public interface TaskMapper {

	public String findCstdnum(String assetnum);
	public void insertIntoCplan(String Cstdnum, String cplannum, String username, String enterdate,
								String assetnum, String regular, String type);
	List<TaskGY> findTask(String executeby, String regular, String type);
	List<TaskStdGY> findTaskStd(String executeby, String regular, String type);

	

}
