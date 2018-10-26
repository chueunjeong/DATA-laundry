/**
 * CREATOR		: iris3
 * CREATE DATE	: 2018. 10. 26. 오후 5:30:48
 * 
 * HANIUM PROJECT. All Right Reserved. 2018. DATA WashMachine
 */
package data.laundry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import data.laundry.dto.Meta_column;
import data.laundry.mapper.Meta_columnMapper;

/**
 * @author iris3
 *
 */

@Service
public class TableService {
	
	@Autowired
	Meta_columnMapper columnMapper;
	
	//테이블 목록
	public List<Meta_column> tables() {
		return columnMapper.groupByTable();
	}
}
