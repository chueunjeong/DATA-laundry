package data.laundry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import data.laundry.dto.All_tab_cols;
import data.laundry.dto.CODE_COMMON;
import data.laundry.dto.CODE_DETAIL;
import data.laundry.dto.Sample;
import data.laundry.mapper.All_tab_colsMapper;
import data.laundry.mapper.CODEHMapper;
import data.laundry.mapper.CODELMapper;
import data.laundry.mapper.SampleMapper;

@Controller
@RequestMapping("jsp")
public class JspController {

	@Autowired
	All_tab_colsMapper columnMapper;
	@Autowired
	SampleMapper sampleMapper;
	@Autowired
	CODEHMapper codeHMapper;
	@Autowired
	CODELMapper codeLMapper;
	
	@RequestMapping("columns")
	public String columns( Model model) {
		List < All_tab_cols > list = columnMapper.findAll();
		model.addAttribute("list", list);
		return "jsp/colums";
	}
	
	@RequestMapping("columns/number")
	public String columns_num(Model model ) {
		List < All_tab_cols > list = columnMapper.findAllNumber();
		model.addAttribute("list", list);
		return "jsp/colums";
	}
	
	
	@RequestMapping("colums/select")
	public String colums_select (Model model) {
		List <Sample> list = sampleMapper.findAll();
		for(int i =0 ; i< list.size(); i++) {
			String name = list.get(i).getName();
			
			CODE_COMMON codeh = codeHMapper.findByName(name);
			int codeh_id = codeh.getId();
		List <CODE_DETAIL> codeL = codeLMapper.findByCodeh_id(codeh_id);
		model.addAttribute("codeL"+i, codeL);
		
		}
		
		return "jsp/columns";
		}	
	
}
