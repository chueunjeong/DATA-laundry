package data.laundry.mapper;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import data.laundry.dto.Sample;
import data.laundry.dto.Standardization;

@Mapper
public interface SampleMapper {
	
	List<Sample> findAll(@Param("table_name") String table_name);
	List<HashMap<String, Object>> findByYN(Standardization standardizaion);
	List<HashMap<String, Object>> findByYesNo(Standardization standardizaion);

}
