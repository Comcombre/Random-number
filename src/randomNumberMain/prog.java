package randomNumberMain;

import java.util.Scanner;

public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nombre nb1 = new Nombre();
		Tentative t1 = new Tentative();
		Scanner sc = new Scanner(System.in);
		do {
			t1.Proposition = sc.nextInt();
			t1.Nombreproposition++;
			if (t1.Proposition == nb1.nombreRandom) {
				System.out.println("Vous avez gagné");
				break;
			}

		} while (t1.Nombreproposition != t1.propositionMax);
		if (t1.Proposition != nb1.nombreRandom) {
			System.out.println("Vous avez perdu");
		}
	}

}
