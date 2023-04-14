package it.epicode.be.godfather.model.orders;

public class Table {
	private Integer numberId;
	private Integer maxNumChairs;
	private boolean booked;

	public Integer getNumberId() {
		return numberId;
	}

	public void setNumberId(Integer numberId) {
		this.numberId = numberId;
	}

	public Integer getMaxNumChairs() {
		return maxNumChairs;
	}

	public void setMaxNumChairs(Integer maxNumChairs) {
		this.maxNumChairs = maxNumChairs;
	}

	public boolean isOccupied() {
		return booked;
	}

	public void setOccupied(boolean booked) {
		this.booked = booked;
	}

}
