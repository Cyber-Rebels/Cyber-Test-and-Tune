package cyberTestAndTune;

import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		
		UserInputProcess uip = new UserInputProcess();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String userInput = "";
		
		while(true) {
			System.out.print("CyberTestAndTune> ");
			userInput = s.nextLine();
			uip.run(userInput.toUpperCase());
		}
	}
}