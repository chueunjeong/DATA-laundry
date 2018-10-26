package data.laundry.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import data.laundry.dto.Standardization;
import data.laundry.dto.Sample;
import data.laundry.dto.FilterResult;
import data.laundry.dto.Meta_column;
import data.laundry.dto.ParameterType;
import data.laundry.mapper.StandardizationMapper;
import data.laundry.service.TableService;
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
	StandardizationMapper standarzationMapper;
	
	@Autowired
	TableService tableService;

	@RequestMapping("columns")
	public List<Meta_column> columns() {
		return columnMapper.findAll();
	}
	
	@RequestMapping("tables")
	public List<Meta_column> tables() {
		return tableService.tables();
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
	public List<Standardization> table_name(@PathVariable("name") String name) {
		return standarzationMapper.showDomain(name);
	}


	//yn필터링
	@RequestMapping(value = "selectedColumn", method = RequestMethod.POST)
	public List<FilterResult> YnFiltering(Model model, HttpServletRequest request, @RequestBody ParameterType parameterType) {
			
		
		//도메인 정보까지 있는 standarzationmeta 테이블에 테이블명과 칼럼 이름을 조건으로 접근
		//ainfo에 분석 테이블, 칼럼이름, 도메인 정보를 채움
		Standardization  ainfo =  standarzationMapper.findByTableAndColumn(parameterType);
		int attrType = ainfo.getDetail_code_id();
		List <FilterResult> r =new ArrayList<FilterResult>();
		//필터링 결과값을 담는 동적 리스트 변수 r
			if ( attrType == 1 ) {
				//-- y n
				 r= sampleMapper.findByYN(ainfo);
				
			} else if ( attrType == 2 ) {
				//-- yes no
				 r= sampleMapper.findByYesNo(ainfo);
				
			}
			
			
			return r;
			

		
	}

	
		
	
	

	@RequestMapping(value = "record/{table_name}")
	public List<Sample> record(Model model, HttpServletRequest request, @PathVariable("table_name") String table_name) {
		return sampleMapper.findAll(table_name);
	}
	
	
	@RequestMapping("codes")
	public List<Standardization> codes() {
		return standarzationMapper.findAll();
	}
	
	
	
	@RequestMapping("code/{group_code_id}")
	public List<Standardization> findByGroup(@PathVariable("group_code_id") int group_code_id) {
		return standarzationMapper.findByGroup_code_id(group_code_id);
	}
	
	/*@RequestMapping("sample/{column_name}")
	public List<Sample> findByGroup(@PathVariable("column_name") String column_name) {
		
		
		
		return columnMapper.findByYn();
	}*/
	
	
	
	
	
}

