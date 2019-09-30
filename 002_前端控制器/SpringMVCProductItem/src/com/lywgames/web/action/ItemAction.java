package com.lywgames.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lywgames.domain.Item;

@Controller
public class ItemAction {
	@RequestMapping("itemList")
	public ModelAndView findAllProducts() {
		ModelAndView mav = new ModelAndView();
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1, "冰箱", 1999.0, new Date(), "保鲜。"));
		itemList.add(new Item(2, "电脑", 8888.0, new Date(), "网上冲浪"));
		itemList.add(new Item(3, "洗衣机", 4000.0, new Date(), "从此不用手。"));
		itemList.add(new Item(4, "空调", 2600.0, new Date(), "冬天制热, 夏天制冷。"));
		itemList.add(new Item(5, "液晶电视", 20000.0, new Date(), "曲面屏幕"));
		//设置商品数据
		mav.addObject("itemList", itemList);
		//设置视图名字
		mav.setViewName("itemList");
		return mav;
	}
}
