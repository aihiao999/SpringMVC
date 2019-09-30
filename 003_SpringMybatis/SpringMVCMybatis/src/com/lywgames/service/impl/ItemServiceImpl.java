package com.lywgames.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lywgames.domain.Item;
import com.lywgames.mapper.ItemMapper;
import com.lywgames.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired(required=true)
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> getItemList() {
		return itemMapper.getItemList();
	}

}
