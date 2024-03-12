package controller;

public class ThreadVetor extends Thread {

	private int[] vect;
	private int num;

	public ThreadVetor(int[] vect, int num) {
		this.vect = vect;
		this.num = num;
	}

	@Override
	public void run() {
		if (num % 2 != 0) {
			double tempoInicial = System.nanoTime();
			for (int atual : vect) {

			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
//			System.out.println("Tempo total: " + tempoTotal + "s.");
			System.out.printf("Tempo total com foreach: %.7fs.\n", tempoTotal);
		} else {
			double tempoInicial = System.nanoTime();
			for (int i = 0; i < vect.length; i++) {

			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
//			System.out.println("Tempo total: " + tempoTotal + "s.");
			System.out.printf("Tempo total com for: %.7fs.\n", tempoTotal);
		}
	}
}
