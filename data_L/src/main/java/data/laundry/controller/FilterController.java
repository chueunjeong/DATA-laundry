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
import data.laundry.service.StandardizationService;
import data.laundry.service.TableService;
import data.laundry.mapper.Meta_columnMapper;
import data.laundry.mapper.SampleMapper;

@RestController
@CrossOrigin
@RequestMapping("api")
public class FilterController {

	@Autowired
	Meta_columnMapper columnMapper;
	@Autowired
	SampleMapper sampleMapper;
	@Autowired
	StandardizationMapper standarzationMapper;
	
	@Autowired
	StandardizationService standardizationService;
	@Autowired
	TableService tableService;
	
	//칼럼 표준화 사전 도메인 목록 
	//name으로 조회 대소문자 구별함.
	@RequestMapping("columns/table_name/{name}")
	public List<Standardization> table_name(@PathVariable("name") String name) {
		return standardizationService.showDomainBytable_name(name);
	}

	
	//yn필터링
	@RequestMapping(value = "selectedColumn", method = RequestMethod.POST)
	public List<FilterResult> YnFiltering(Model model, HttpServletRequest request, @RequestBody ParameterType parameterType) {
			
		return standardizationService.filterGroupCode1(parameterType);
		
	}

	
		
	
	

	
	
	
	
	
	
	
}

