package data.laundry.mapper;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import data.laundry.dto.Sample;

public interface SampleMapper extends CrudRepository<Sample, Integer> {
	List<Sample> findAll();
	
	
}
