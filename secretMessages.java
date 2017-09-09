package demo;

public class secretMessages {
	String outTwo = "";

	public String secret(String message, int keyOne) {

		System.out.println("Value received");

		// this.message = message;
		// this.keyOne = keyOne;

		// int keyOne1 = Integer.parseInt(keyOne);
		if (message != null) {
			System.out.println("Inside while loop");

			for (int z = 0; z < message.length(); z++) {
				char in = message.charAt(z);
				if (in >= 'A' && in <= 'Z') {
					in = (char) (in + keyOne);
					if (in > 'Z') {
						in = (char) (in - 26);
					}
					if (in < 'A') {
						in = (char) (in + 26);
					}
				}

				if (in >= 'a' && in <= 'z') {
					in = (char) (in + keyOne);
					if (in > 'z') {
						in = (char) (in - 26);
					}
					if (in < 'a') {
						in = (char) (in + 26);
					}
				}
				if (in >= '0' && in <= '9') {
					in = (char) (in + keyOne);
					if (in > '9') {
						in = (char) (in - 9);
					}
					if (in < '0') {
						in = (char) (in + 9);
					}
				}

				outTwo += in;
			}

		}
		return outTwo;
	}
}
