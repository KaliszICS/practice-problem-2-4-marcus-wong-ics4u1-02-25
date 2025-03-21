public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void selectionSortName(String[] names, int[] ages) {
		for (int i = 0; i < names.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareToIgnoreCase(names[smallestIndex]) < 0) {
					smallestIndex = j;

				}

			}
			String tempNames = names[i];
			names[i] = names[smallestIndex];
			names[smallestIndex] = tempNames;

		    int tempAges = ages[i];
			ages[i] = ages[smallestIndex];
			ages[smallestIndex] = tempAges;
			
		}
	}
	public static void selectionSortAge(String[] names, int[] ages) {
		for (int i = 0; i < ages.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < ages.length; j++) {
				if (ages[j] < (ages[smallestIndex])) {
					smallestIndex = j;

				}

			}
			int tempAges2 = ages[i];
			ages[i] = ages[smallestIndex];
			ages[smallestIndex] = tempAges2;

			String tempNames2 = names[i];
			names[i] = names[smallestIndex];
			names[smallestIndex] = tempNames2;
			
		}

	}

	

}
