package randomNumberMain;

import java.util.Random;

public class Nombre {

	int nombreRandom;
	int nombreMax;
	int nombreMin;

	public int getNombreMax() {
		return nombreMax;
	}

	public void setNombreMax(int nombreMax) {
		this.nombreMax = nombreMax;
	}

	public int getNombreMin() {
		return nombreMin;
	}

	public void setNombreMin(int nombreMin) {
		this.nombreMin = nombreMin;
	}

	public Nombre() {
		this.nombreMax = 10;
		this.nombreMin = 0;
		this.nombreRandom = getRandomNumberInRange(this.nombreMin, this.nombreMax);
	}

	public Nombre(int min, int max) {
		this.nombreMax = max;
		this.nombreMin = min;
		this.nombreRandom = getRandomNumberInRange(this.nombreMin, this.nombreMax);
	}

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
