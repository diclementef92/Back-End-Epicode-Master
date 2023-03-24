package teoria;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

public class firstMaven {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			public void run() {
				System.out.println("ciao da classe anonima");
			}
		};
		
		Runnable r2 = () -> System.out.println("ciao da funzione freccia");
		r2.run();
		r.run();

		FileFilter ff1 = new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return false;
			}
		};

		FileFilter ff2 = (File f) -> true;

		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer arg1, Integer arg2) {
				// TODO Auto-generated method stub
				return arg1 - arg2;
			}

		};
		Comparator<Integer> c1 = (Integer a1, Integer a2) -> a1 - a2;

	}
}
