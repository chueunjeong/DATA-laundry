package data.laundry.mapper;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.laundry.dto.ParameterType;
import data.laundry.dto.Sample;
import data.laundry.dto.Standardization;

@Mapper
public interface SampleMapper {
	
	List<Sample> findAll();
	List<HashMap<String, Object>> findByYN(Standardization standarzaion);
	List<HashMap<String, Object>> findByYesNo(Standardization standarzaion);

}
