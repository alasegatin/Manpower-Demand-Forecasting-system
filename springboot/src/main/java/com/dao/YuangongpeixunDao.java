package com.dao;

import com.entity.YuangongpeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongpeixunVO;
import com.entity.view.YuangongpeixunView;


/**
 * 员工培训
 * 
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
public interface YuangongpeixunDao extends BaseMapper<YuangongpeixunEntity> {
	
	List<YuangongpeixunVO> selectListVO(@Param("ew") Wrapper<YuangongpeixunEntity> wrapper);
	
	YuangongpeixunVO selectVO(@Param("ew") Wrapper<YuangongpeixunEntity> wrapper);
	
	List<YuangongpeixunView> selectListView(@Param("ew") Wrapper<YuangongpeixunEntity> wrapper);

	List<YuangongpeixunView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongpeixunEntity> wrapper);
	
	YuangongpeixunView selectView(@Param("ew") Wrapper<YuangongpeixunEntity> wrapper);
	

}
