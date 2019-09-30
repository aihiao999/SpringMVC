package com.lywgames.service;

import java.util.List;

import com.lywgames.domain.Item;

public interface ItemService {
	/**
	 * 获取商品列表
	 * @return
	 */
	List<Item> getItemList();
}
