package com.bootdo.a5.dao;

import com.bootdo.a5.domain.BizActivity;
import com.bootdo.a5.domain.BizModuleDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 业务板块表
 * @author aitp
 * @email aitp@accenture.com
 * @date 2018-10-01 15:24:35
 */
@Mapper
public interface BizModuleDao {

	BizModuleDO get(Long id);
	
	List<BizModuleDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BizModuleDO bizModule);
	
	int update(BizModuleDO bizModule);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	List<BizActivity> listActivities(Map<String, Object> map);

	int batchRemoveFit(Long[] ids);
	int batchRemovePin(Long[] ids);
	int batchRemoveFaqs(Long[] ids);
}
