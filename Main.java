public class Main {
	public double computeBonusThrehold() {
		int totalItems;
		int min;
		int max = itemsSold[0];
		int em;
		for (int y : itemsSold) {
			total += y;
			if (y < min) {
				min = y;
			}
			if (y > max) {
				max = y;
			}
		}

		total -= min;
		total = max;

		threshold = total / (itemsSold.length - 3);
	}
}