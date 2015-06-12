package com.jacobo.Iterator1;

import java.util.ArrayList;

/**
 * esta seria una clase que usa los elementos del menu en forma de ArrayList
 * @author jake
 *
 */

public class PancakeHouseMenu {
	
	private ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		addItem("plato 1 ", "plato 1", true, 3.00);
		addItem("plato 2", "plato 2", false, 4.00);
		addItem("plato 3", "plato 3", true, 5.00);
		
		
	}
	
	private void addItem(String name, String description,
			boolean vegetarian, double price){
		menuItems.add(new MenuItem(name, description, vegetarian, price));
	}
	
	public ArrayList<MenuItem> getmenuItems(){
		return menuItems;
	}

}
