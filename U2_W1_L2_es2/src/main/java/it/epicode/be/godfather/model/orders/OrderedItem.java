package it.epicode.be.godfather.model.orders;

import it.epicode.be.godfather.model.MenuItem;

public class OrderedItem {
	private MenuItem menuItem;
	private String note;

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

}
