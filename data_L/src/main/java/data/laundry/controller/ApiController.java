package data.laundry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.laundry.dto.Standarzation;
import data.laundry.dto.Sample;

import data.laundry.dto.Meta_column;
import data.laundry.mapper.StandarzationMapper;
import data.laundry.mapper.Meta_columnMapper;
import data.laundry.mapper.SampleMapper;

@RestController
@CrossOrigin
@RequestMapping("api")
public class ApiController {

	@Autowired
	Meta_columnMapper columnMapper;
	@Autowired
	SampleMapper sampleMapper;
	@Autowired
	StandarzationMapper standarzationMapper;
	

	@RequestMapping("columns")
	public List<Meta_column> columns() {
		return columnMapper.findAll();
	}
	
	@RequestMapping("tables")
	public List<Meta_column> tables() {
		return columnMapper.groupByTable();
	}
	

	//id로 조회
	@RequestMapping("columns/id/{id}")
	public List<Meta_column> column_id(@PathVariable("id") int id) {
		return columnMapper.findById(id);
	}
	
	//name으로 조회 대소문자 구별함.
	@RequestMapping("columns/column_name/{name}")
	public List<Meta_column> column_name(@PathVariable("name") String name) {
		return columnMapper.findByColumn_name(name);
	}

	//name으로 조회 대소문자 구별함.
	@RequestMapping("columns/table_name/{name}")
	public List<Standarzation> table_name(@PathVariable("name") String name) {
		return standarzationMapper.showDomain(name);
	}

	//name으로 조회 대소문자 구별함.
	@RequestMapping("SAMPLE/YN")
	public List<Sample> yn() {
		
		return sampleMapper.findByYN();
	}

	
		
	
	

	@RequestMapping("record/SAMPLE")
	public List<Sample> record_samples() {
		return sampleMapper.findAll();
	}
	
	
	@RequestMapping("codes")
	public List<Standarzation> codes() {
		return standarzationMapper.findAll();
	}
	
	
	
	@RequestMapping("code/{group_code_id}")
	public List<Standarzation> findByGroup(@PathVariable("group_code_id") int group_code_id) {
		return standarzationMapper.findByGroup_code_id(group_code_id);
	}
	
	/*@RequestMapping("sample/{column_name}")
	public List<Sample> findByGroup(@PathVariable("column_name") String column_name) {
		
		
		
		return columnMapper.findByYn();
	}*/
	
	
	
	
	
}

