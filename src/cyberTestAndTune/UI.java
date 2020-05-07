package cyberTestAndTune;

import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		
		while(true) {
			
			UserInputProcess uip = new UserInputProcess();
			Scanner s = new Scanner(System.in);
			
			System.out.print("CyberTestAndTune> ");
			
			String userInput = s.nextLine();
			uip.run(userInput.toUpperCase());
			
		}
	}
}