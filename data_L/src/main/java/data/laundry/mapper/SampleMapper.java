package data.laundry.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.laundry.dto.Sample;

@Mapper
public interface SampleMapper {
	
	List<Sample> findAll();
	List<Sample> findByYN();

}
