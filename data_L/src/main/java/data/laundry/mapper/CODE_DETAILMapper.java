package data.laundry.mapper;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import data.laundry.dto.CODE_DETAIL;

public interface CODE_DETAILMapper extends CrudRepository<CODE_DETAIL, Integer>{

List<CODE_DETAIL> findAll();
	
	@Query(nativeQuery = true, value=
			"select * from CODEL where codeh_id = :codeh_id ")
	List<CODE_DETAIL> findByCodeh_id(@Param("codeh_id") int codeh_id);
	
}
