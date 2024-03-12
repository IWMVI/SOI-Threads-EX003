package view;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {

		int[] vect = new int[1000];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = (int) (Math.random() * 100 + 1);
		}
		Thread t1 = new ThreadVetor(vect, 1);
		t1.start();
		Thread t2 = new ThreadVetor(vect, 2);
		t2.start();

	}
}
