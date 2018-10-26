/**
 * CREATOR		: iris3
 * CREATE DATE	: 2018. 9. 21. 오후 8:22:56
 * 
 * HANIUM PROJECT. All Right Reserved. 2018. DATA WashMachine
 */
package data.laundry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.laundry.dto.ParameterType;
import data.laundry.mapper.Meta_columnMapper;

/**
 * @author iris3
 *
 */
/*
@Service
public class DataTypeService {
	
	@Autowired
	Meta_columnMapper meta_columnMapper;
	
	void WriteDataType( String columnName) {
		
		
		String dataType = meta_columnMapper.findByColumn_name(columnName);

		ParameterType p = new ParameterType();
		p.setColumnName(columnName);
		
		if (dataType.equals("varchar")) {
			
			p.setStringType("String");
			meta_columnMapper.insertStringType(p);
		}
		else if (dataType.equals("number")){
			p.setStringType("Integer");
			meta_columnMapper.insertStringType(p);
		}
		else {
			
		}
		
		
		
			
		
	}

}
*/