package data.laundry.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import data.laundry.dto.FilterResult;
import data.laundry.dto.ParameterType;
import data.laundry.dto.Standardization;
import data.laundry.mapper.SampleMapper;
import data.laundry.mapper.StandardizationMapper;

@Service
public class StandardizationService {
	@Autowired
	StandardizationMapper standardizationMapper;
	
	@Autowired
	SampleMapper sampleMapper;
	
	public List<Standardization> showDomainBytable_name(@PathVariable("name") String name) {
		return standardizationMapper.showDomain(name);
	}

	
	public List<Standardization> codes() {
		return standardizationMapper.findAll();
	}
	
	public List<Standardization> findByGroup( int group_code_id) {
		return standardizationMapper.findByGroup_code_id(group_code_id);
	}

	
	public List<FilterResult> filterGroupCode1(ParameterType parameterType){
	//도메인 정보까지 있는 standarzationmeta 테이블에 테이블명과 칼럼 이름을 조건으로 접근
			//ainfo에 분석 테이블, 칼럼이름, 도메인 정보를 채움
			Standardization  ainfo =  standardizationMapper.findByTableAndColumn(parameterType);
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
}