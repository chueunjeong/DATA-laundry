package data.laundry.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import data.laundry.dto.ParameterType;
import data.laundry.dto.Standardization;

@Mapper
public interface StandardizationMapper {
	
	List<Standardization> findAll();
	
	Standardization findByTableAndColumn(ParameterType parameterType);
	
	List<Standardization> findByGroup_code_id(int group_code_id);
	
	
	List<Standardization >showDomain(String table_name );
}
