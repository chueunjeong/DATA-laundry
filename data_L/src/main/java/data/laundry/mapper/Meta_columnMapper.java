package data.laundry.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.laundry.dto.Meta_column;

@Mapper
public interface Meta_columnMapper{
	List<Meta_column> findAll();
	List<Meta_column> groupByTable();
	
	List<Meta_column> findByTable_name(String table_name);

	List<Meta_column> findById(int id);
	List<Meta_column> findByColumn_name(String column_name);
	List<Meta_column> findByData_type(String data_type);
	
	
}
