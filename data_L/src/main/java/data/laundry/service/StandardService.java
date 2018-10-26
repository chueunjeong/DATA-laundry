package data.laundry.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.laundry.dto.Meta_column;
import data.laundry.dto.ParameterType;
import data.laundry.mapper.Meta_columnMapper;
/*
@Service
public class StandardService {
	@Autowired
	Meta_columnMapper meta_columnMapper;
	
	
	List<Result> yn(){
		
		
	String str = "1;2;3";
	StringTokenizer st = new StringTokenizer(str, ";");
	List<String> tokens = new ArrayList();
	while(st.hasMoreElements()) {
		String token = st.nextToken();
		
		tokens.add(token);
	}
	
	for(String index : tokens) {
		
		HashMap<String, Object> query = new HashMap<String, Object>();
		query.put("index", index);
		Meta_column ainfo = meta_columnMapper.findById(Integer.valueOf(index));
		
		String columnName = ainfo.getColumn_name();
		String tableName = ainfo.getTable_name();
		//도메인 유형 String attrType = ainfo.getStringType();
		
		if ( attrType.equals("YN") ) {
			
			ParameterType paramType = new ParameterType();
			paramType.setTableName("");
			paramType.setColumnName(columnName);
			
			List<HashMap<String, Object>> r = sampleMapper.findByYN(paramType);
			//-- yn
		} else if ( attrType.equals("Integer" )) {
			//-- date
		}
		
		
		String findValue;
		for(HashMap<String, Object> info : r ) {
//			for(String key : schema) {
//				Object value = info.get(key);
//				
//				
//			}
			Object value = info.get(columnName);
			if ( value != null ) {
				findValue = (String)value;

				//-- to do write invalid target info table
				
			}
			//return result table
		}
		
	}

	}
	
	
	
	

}
*/