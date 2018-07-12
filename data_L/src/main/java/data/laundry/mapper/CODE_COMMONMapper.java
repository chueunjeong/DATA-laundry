package data.laundry.mapper;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import data.laundry.dto.CODE_COMMON;

public interface CODE_COMMONMapper extends CrudRepository<CODE_COMMON, Integer>{
	
	List<CODE_COMMON> findAll();
	
	@Query(nativeQuery = true, value=
			"select * from CODEH where name like :name ")
	CODE_COMMON findByName(@Param("name") String name);
	
}
