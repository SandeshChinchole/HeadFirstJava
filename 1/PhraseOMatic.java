
public class PhraseOMatic {

	public static void main(String[] args) {
		
		//three sets of words to choose from

		String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win"};
		
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed"};
		
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy"};
		
		//word count in each list
		
		int lengthOne = (int) wordListOne.length;
		int lengthTwo = (int) wordListTwo.length;
		int lengthThree = (int) wordListThree.length;
		
		//generate three random numbers
		
		int rand1 = (int) (Math.random() * lengthOne);
		int rand2 = (int) (Math.random() * lengthTwo);
		int rand3 = (int) (Math.random() * lengthThree);
		
		//build phrase
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//print phrase
		
		System.out.println(phrase);
		
		}

}
