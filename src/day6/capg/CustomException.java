package day6.capg;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CustomException {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("not valid to vote");
		} else {
			System.out.println("vote");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(17);
		} catch (InvalidAgeException e) {
			System.out.println("exception caught");
			System.out.println(e.getMessage());
		}
	}
}