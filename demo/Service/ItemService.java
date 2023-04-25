package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Item;

@Service
public class ItemService {
	public static int itemcount=5;
	private static List<Item> items= new ArrayList<>();
	static {
		items.add(new Item(1,"laptop"));
		items.add(new Item(2,"mobile"));
		items.add(new Item(3,"Tablet"));
		items.add(new Item(4,"Tv"));
		items.add(new Item(5,"Headphone"));
	}
	public List<Item> getAllItems(){
		return items;
	}
	public Item getitem(int id) {
		for(Item i:items)
		{
			if(i.getId()==id)
				return i;
		}
		return null;
	}
	public Item addNewItem(Item item) {
		item.setId(++itemcount);
		items.add(item);
		return item;
	}

}
