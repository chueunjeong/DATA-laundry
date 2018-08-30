package data.laundry.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.laundry.dto.All_tab_cols;

@Mapper
public interface All_tab_colsMapper{
	List<All_tab_cols> findAll();
	
	List<All_tab_cols> findByColumn_id(int column_id);
	List<All_tab_cols> findByColumn_name(String column_name);
	List<All_tab_cols> findAllNumber();
	
	
}
