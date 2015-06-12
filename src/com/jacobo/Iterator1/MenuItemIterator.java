package com.jacobo.Iterator1;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuItemIterator implements Iterator {
	
	private ArrayList<MenuItem> menuItems;
	private MenuItem[] aMenuItems;
	private int numOfItems;
	
	public MenuItemIterator(ArrayList<MenuItem> menuItems){
		this.menuItems = menuItems;
	}
	
	public MenuItemIterator(MenuItem[] menuItems){
		numOfItems = 0;
		aMenuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(menuItems == null){
			if(numOfItems > aMenuItems.length || aMenuItems[numOfItems] == null){
				return false;
			} else {
				return true;
			}
		} else {
			if(numOfItems > menuItems.size()-1 || menuItems.get(numOfItems) == null ){
				return false;
			} else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if(menuItems == null){
			return aMenuItems[numOfItems++];
		} else {
			return menuItems.get(numOfItems++);
		}
	}

}
