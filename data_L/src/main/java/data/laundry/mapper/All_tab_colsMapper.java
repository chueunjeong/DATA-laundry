package data.laundry.mapper;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import data.laundry.dto.All_tab_cols;


public interface All_tab_colsMapper extends CrudRepository<All_tab_cols, Integer> {

	List<All_tab_cols> findAll();
	
	@Query(nativeQuery = true, value=
			"select c.column_id, c.column_name, c.data_type from all_tab_cols c where c.column_id = :column_id")
	List<All_tab_cols> findByColumn_id(@Param("column_id") int column_id);
	
	@Query(nativeQuery = true, value=
			"select c.column_id, c.column_name, c.data_type from all_tab_cols c where c.data_type='NUMBER'")
	List<All_tab_cols> findAllNumber();
	
	
}
