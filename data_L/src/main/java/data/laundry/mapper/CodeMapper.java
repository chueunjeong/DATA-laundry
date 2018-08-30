package data.laundry.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.laundry.dto.Code;

@Mapper
public interface CodeMapper {
	
	List<Code> findAll();
	List<Code> findByGroup_code_id(int group_code_id);
	
	

}
