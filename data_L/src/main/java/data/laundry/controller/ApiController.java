package data.laundry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.laundry.dto.All_tab_cols;
import data.laundry.mapper.All_tab_colsMapper;

@RestController
@CrossOrigin
@RequestMapping("api")
public class ApiController {

	@Autowired
	All_tab_colsMapper columnMapper;
	
	@RequestMapping("columns")
	public List<All_tab_cols> columns() {
		return columnMapper.findAll();
	}
	
	@RequestMapping("columns/number")
	public List<All_tab_cols> columns_num() {
		return columnMapper.findAllNumber();
	}
	
}
