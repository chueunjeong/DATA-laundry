package data.laundry.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.laundry.dto.Standarzation;

@Mapper
public interface StandarzationMapper {
	
	List<Standarzation> findAll();
	List<Standarzation> findByGroup_code_id(int group_code_id);
	
	
	List<Standarzation >showDomain(String table_name );
}
