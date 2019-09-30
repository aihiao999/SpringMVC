package com.lywgames.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lywgames.domain.Item;
import com.lywgames.service.ItemService;

@Controller
public class ItemAction {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("itemList")
	public ModelAndView getItemList() {
		ModelAndView modelAndView = new ModelAndView();
		List<Item> items = itemService.getItemList();
		modelAndView.addObject("itemList", items);
		modelAndView.setViewName("itemList");;
		return modelAndView;
	}
}
