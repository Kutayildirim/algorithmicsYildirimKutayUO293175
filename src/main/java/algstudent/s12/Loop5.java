package algstudent.s12;

import java.util.Random;

public class Loop5 {

	public static long loop5(int n) {
		Random rn = new Random();
		int cont = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++)
				for (int k = 1; k <= n; k++)
					for (int l = 1; l <= n; l++)
						cont += rn.nextInt();
		return cont;
	}

	public static void main(String arg[]) {
		long t1, t2;
		long cont = 0;
		int repetitions = Integer.parseInt(arg[0]);

		for (int n = 1; n <= Integer.MAX_VALUE; n *= 2) {
			t1 = System.currentTimeMillis();

			for (int repetition = 1; repetition <= repetitions; repetition++) {
				cont = loop5(n);
			}

			t2 = System.currentTimeMillis();
			System.out.println("n=" + n + "\tTIME=" + (t2 - t1) + "\tCONT=" + cont + "\trepetitions=" + repetitions);
		} // for
	} // main
} // class