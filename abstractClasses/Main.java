package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator[] gameCalculators = new GameCalculator[]
				//{new WomanGameCalculator(),new ManGameCalculator(),new KidsGameCalculator()};
		
		 GameCalculator gameCalculator = new WomanGameCalculator();
	}
}
