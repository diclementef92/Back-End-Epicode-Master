package it.epicode.be.godfather.model.orders;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private Integer numId;
	private Table table;
	private OrderState state;
	private List<OrderedItem> orderedItems;

	public void addOrderedItem(OrderedItem i) {
		orderedItems.add(i);
	}

}
