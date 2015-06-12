package com.jacobo.Iterator1;

public class DinnerHouseMenu {
	
	private static final int MAX=3;
	private int numOfItems = 0;
	private MenuItem[] menuItems;
	
	public DinnerHouseMenu(){
		menuItems = new MenuItem[MAX];
		addItem("item 1", "item 1", true, 3.00);
		addItem("item 2", "item 2", false, 4.00);
		addItem("item 3", "item 3", true, 3.2);
	}
	
	private void addItem(String name, String description,
			boolean vegetarian, double price){
		menuItems[numOfItems] = new MenuItem(name, description, vegetarian,price);
		numOfItems++;
	}
	
	public MenuItem[] getMenuItem(){
		return menuItems;
	}

}
