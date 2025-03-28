package userdefined;

class AgeExcpetion extends Exception {
	public AgeExcpetion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class Vote {

	void Voter(int age) throws AgeExcpetion {
		if (age > 18) {
			System.out.println("you are alloweed to vote");

		} else {
			throw new AgeExcpetion("you are ineligible to vote");

		}

	}

}

public class Main {
	public static void main(String[] args) {

		Vote vote = new Vote();
		try {
			vote.Voter(14);
		} catch (AgeExcpetion e) {
			// TODO Auto-generated catch block
			System.out.println(e);

		}

	}

}
