package com.example.excl.mapper;
import com.example.excl.domain.Org;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SspOrgMapper {

	//根据机构编号 获取所属一代信息
	public List<Org> getTopAgent1Org(String orgUuid);
}