/**
 * CREATOR		: iris3
 * CREATE DATE	: 2018. 9. 21. 오후 8:22:56
 * 
 * HANIUM PROJECT. All Right Reserved. 2018. DATA WashMachine
 */
package data.laundry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import data.laundry.dto.Meta_column;
import data.laundry.mapper.Meta_columnMapper;

@Service
public class ColumnService {
	
	@Autowired
	Meta_columnMapper columnMapper;
	
	@RequestMapping("columns")
	public List<Meta_column> columns() {
		return columnMapper.findAll();
	}
	

	

	//id로 조회
	@RequestMapping("columns/id/{id}")
	public List<Meta_column> column_id(@PathVariable("id") int id) {
		return columnMapper.findById(id);
	}
}
