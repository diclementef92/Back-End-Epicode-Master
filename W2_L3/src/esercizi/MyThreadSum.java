package esercizi;

import java.util.List;

public class MyThreadSum extends Thread {
	private Integer sum;
	private List<Integer> numbers;

	public MyThreadSum(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public void run() {
		int temp = 0;
		for (Integer num : numbers) {
			temp += num;
		}
		setSum(temp);
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
