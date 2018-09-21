package data.laundry.mapper;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.laundry.dto.ParameterType;
import data.laundry.dto.Sample;

@Mapper
public interface SampleMapper {
	
	List<Sample> findAll();
	List<HashMap<String, Object>> findByYN(ParameterType paramType);

}
