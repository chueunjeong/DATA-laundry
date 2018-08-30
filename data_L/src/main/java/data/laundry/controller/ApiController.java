package data.laundry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.laundry.dto.All_tab_cols;
import data.laundry.dto.Code;
import data.laundry.dto.Sample;
import data.laundry.mapper.All_tab_colsMapper;
import data.laundry.mapper.CodeMapper;
import data.laundry.mapper.SampleMapper;

@RestController
@CrossOrigin
@RequestMapping("api")
public class ApiController {

	@Autowired
	All_tab_colsMapper columnMapper;
	@Autowired
	SampleMapper sampleMapper;
	@Autowired
	CodeMapper codeMapper;
	@RequestMapping("columns")
	public List<All_tab_cols> columns() {
		return columnMapper.findAll();
	}
	

	//id로 조회
	@RequestMapping("columns/id/{id}")
	public List<All_tab_cols> column_id(@PathVariable("id") int id) {
		return columnMapper.findByColumn_id(id);
	}
	
	//name으로 조회 대소문자 구별함.
	@RequestMapping("columns/name/{name}")
	public List<All_tab_cols> column_name(@PathVariable("name") String name) {
		return columnMapper.findByColumn_name(name);
	}

	
	//type이 "number"인 것만 조회
	@RequestMapping("columns/number")
	public List<All_tab_cols> columns_num() {
		return columnMapper.findAllNumber();
	}

	@RequestMapping("samples")
	public List<Sample> samples() {
		return sampleMapper.findAll();
	}
	
	
	@RequestMapping("codes")
	public List<Code> codes() {
		return codeMapper.findAll();
	}
	
	
	
	@RequestMapping("code/{group_code_id}")
	public List<Code> findByGroup(@PathVariable("group_code_id") int group_code_id) {
		return codeMapper.findByGroup_code_id(group_code_id);
	}
	
	
}

