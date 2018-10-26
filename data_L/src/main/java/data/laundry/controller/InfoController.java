/**
 * CREATOR		: iris3
 * CREATE DATE	: 2018. 10. 26. 오후 5:28:03
 * 
 * HANIUM PROJECT. All Right Reserved. 2018. DATA WashMachine
 */
package data.laundry.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.laundry.dto.Meta_column;
import data.laundry.dto.Sample;
import data.laundry.dto.Standardization;
import data.laundry.mapper.Meta_columnMapper;
import data.laundry.mapper.SampleMapper;
import data.laundry.mapper.StandardizationMapper;
import data.laundry.service.ColumnService;
import data.laundry.service.StandardizationService;
import data.laundry.service.TableService;

/**
 * @author iris3
 *
 */
@RestController
@CrossOrigin
@RequestMapping("api")
public class InfoController {

	@Autowired
	Meta_columnMapper columnMapper;
	@Autowired
	SampleMapper sampleMapper;
	@Autowired
	StandardizationMapper standarzationMapper;
	
	@Autowired
	TableService tableService;
	@Autowired
	ColumnService columnService;
	@Autowired
	StandardizationService standardizationService;
	
	//테이블 목록 조회
	@RequestMapping("tables")
	public List<Meta_column> tables() {
		return tableService.tables();
	}
	
	//레코드 목록 조회
	@RequestMapping(value = "record/{table_name}")
	public List<Sample> record(Model model, HttpServletRequest request, @PathVariable("table_name") String table_name) {
		return sampleMapper.findAll(table_name);
	}
	
	//칼럼 목록 조회
	@RequestMapping("columns")
	public List<Meta_column> columns() {
		return columnService.columns();
	}
	

	//id로 조회
	@RequestMapping("columns/id/{id}")
	public List<Meta_column> column_id(@PathVariable("id") int id) {
		return columnService.column_id(id); 
	}
	
	//name으로 조회 대소문자 구별함.
	@RequestMapping("columns/column_name/{name}")
	public List<Meta_column> column_name(@PathVariable("name") String name) {
		return columnService.column_name(name);
	}



	@RequestMapping("codes")
	public List<Standardization> codes() {
		return standardizationService.codes();
	}
	
	
	
	@RequestMapping("code/{group_code_id}")
	public List<Standardization> findByGroup(@PathVariable("group_code_id") int group_code_id) {
		return standardizationService.findByGroup(group_code_id);
	}
}

