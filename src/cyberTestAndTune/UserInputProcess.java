package cyberTestAndTune;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputProcess {
	
	public void run(String command) {
		ArrayList<String> args = new ArrayList();
		Scanner argInput = new Scanner(command);
		
		while (argInput.hasNext())
			args.add(argInput.next());
		
		processCommand(args);
	}
	
	public void processCommand(ArrayList<String> args) {
		if (args.size() !=0) {
			switch(args.get(0)) {
			case "HELP":
				switch(args.size()) {
				case 1:
					help();
					return;
				default:
					switch(args.get(1)) {
					case "HELP":
						return;
					default:
						printError(args,1);
						return;
					}
				}
			case "QUIT":
				System.exit(0);
				return;
			default:
				printError(args,0);
				return;
			}
		}
	}
	
	public void help() {
		StringBuffer help = new StringBuffer();		
		help.append("For more information on a specific command, type HELP command-name\n\n");
		help.append("HELP\tPrint this help menu.\n");
		help.append("QUIT\tClose the program.\n");
		System.out.println(help);
	}
	
	public void printError(ArrayList<String> args, int errorIndex) {
		int errorCharStart = 0;
		StringBuffer error = new StringBuffer();
		error.append("Error: Invalid command.\n\n");
		for(int i = 0; i < args.size(); i++) {
			error.append(args.get(i));
			error.append(" ");
			
			if(errorIndex != 0)
				if(errorIndex > i)
					errorCharStart += args.get(i).length() + 1;
		}
		error.append("\n");
		while (errorCharStart > 0) {
			error.append(" ");
			errorCharStart--;
		}
		error.append("^\n");
		System.out.println(error);
	}
}
