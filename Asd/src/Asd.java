
public class Asd {
	public static void main(String[] args) {
		double pi=1;
		for (double i = 1; i <= 10000; i++) {
			pi=pi*(2*i/(2*i-1))*(2*i/(2*i+1));
		}
		pi=pi*2;
		System.out.println(pi);
		
		//2.
		
		double pil=0;
		for (int i = 0; i <= 10000; i++) {
			pil=pil+(Math.pow((-1), i)/(2*i+1));
			
		}
		pil=pil*4;
		System.out.println(pil);
		
		//3.
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(faktszam(i));
		}
		
		//4.
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
		
		//5.
		
		
		}
	public static int faktszam(int limit) {
		int fakt=1;
		for (int i = 1; i <= limit; i++) {
			fakt=fakt*i;
		}
		return fakt;
		
		
	}
	
	}



