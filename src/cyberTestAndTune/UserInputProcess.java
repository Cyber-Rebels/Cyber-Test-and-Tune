package cyberTestAndTune;

import java.util.ArrayList;
import java.util.Scanner;
import practice.Practice;

public class UserInputProcess {
	
	private Practice practice = new Practice();
	
	public void run(String command) {
		ArrayList<String> args = new ArrayList<String>();
		Scanner argInput = new Scanner(command.toUpperCase());
		
		while (argInput.hasNext())
			args.add(argInput.next());
		
		argInput.close();
		
		processCommand(args);
	}
	
	public void help() {
		StringBuffer help = new StringBuffer();		
		help.append("For more information on a specific command, type HELP command-name\n\n");
		help.append("HELP\t\tPrint this help menu.\n");
		help.append("PRACTICE\tControl the practice session.\n");
		help.append("QUIT\t\tClose the program.\n");
		System.out.println(help);
	}
	
	public void processCommand(ArrayList<String> args) {
		if (args.size() !=0) {
			switch(args.get(0)) {
				case "HELP":
					switch(args.size()) {
						case 1:
							help();
							return;
						case 2:
							args.set(0, args.get(1));
							args.remove(1);
							processCommand(args);
							return;
						default:
							args.remove(2);
							processCommand(args);
							return;
					}
				case "PRACTICE":
					switch(args.size()) {
						case 1:
							StringBuffer sPractice = new StringBuffer();
							sPractice.append("Control the practice session.\n\n");
							sPractice.append("PRACTICE [operand]\n\n");
							sPractice.append("lapAdd\tAdd a lap to the practice session.\n");
							sPractice.append("lapSet\tEdit a lap on the practice session.\n");
							sPractice.append("new\tStart a new practice session.\n");
							sPractice.append("tune\tEdit the car setup.\n");
							System.out.println(sPractice);
							return;
						case 2:
							switch(args.get(1)) {
								case "LAPADD":
									StringBuffer sPracticeLapAdd = new StringBuffer();
									sPracticeLapAdd.append("Add a lap to the practice session.\n\n");
									sPracticeLapAdd.append("PRACTICE LAPADD [time]\n\n\t");
									sPracticeLapAdd.append("time\t\tAdd a new lap with the provided lap time.\n");
									System.out.println(sPracticeLapAdd);
									return;
								case "LAPSET":
									StringBuffer sPracticeLapSet = new StringBuffer();
									sPracticeLapSet.append("Edit a lap on the practice session.\n\n");
									sPracticeLapSet.append("PRACTICE LAPSET [lap] [time]\n\n\t");
									sPracticeLapSet.append("lap\t\tLap number to be changed.\n");
									sPracticeLapSet.append("time\t\tNew lap time.\n");
									System.out.println(sPracticeLapSet);
									return;
								case "NEW":
									practice = new Practice();
									return;
								case "TUNE":
									StringBuffer sPracticeTune = new StringBuffer();
									sPracticeTune.append("Edit the car setup.\n\n");
									sPracticeTune.append("PRACTICE TUNE [part] [value]\n\n\t");
									sPracticeTune.append("part\t\tPart to be tuned.\n");
									sPracticeTune.append("value\t\tWhat to change the part to.\n");
									System.out.println(sPracticeTune);
									return;
								default:
									printError(args,1);
									return;
							}
						case 3:
							switch(args.get(1)) {
								case "LAPADD":
									try {
										practice.addLap(Double.parseDouble(args.get(2)));
									} catch(NumberFormatException e) {
										printError(args,2);
									}
									return;
								case "TUNE":
									StringBuffer sPracticeTune = new StringBuffer();
									sPracticeTune.append("Edit the car setup.\n\n");
									sPracticeTune.append("PRACTICE TUNE [part] [value]\n\n\t");
									sPracticeTune.append("part\t\tPart to be tuned.\n");
									sPracticeTune.append("value\t\tWhat to change the part to.\n");
									System.out.println(sPracticeTune);
									return;
								default:
									printError(args,1);
									return;
							}
						case 4:
							switch(args.get(1)) {
								case "LAPSET":
									int lap = -1;
									double time = -1;
									try {
										lap = Integer.parseInt(args.get(2));
									} catch(NumberFormatException e) {
										printError(args,2);
										return;
									}
									try {
										time = Double.parseDouble(args.get(3));
									} catch(NumberFormatException e) {
										printError(args,3);
										return;
									}
									if (lap > 0 && time >= 0)
										practice.setLapTime(lap, time);
									return;
								case "TUNE":
									try {
										practice.tune(args.get(2), Double.parseDouble(args.get(3)));
									} catch(NumberFormatException e) {
										printError(args,3);
										return;
									}
									return;
								default:
									printError(args,1);
									return;
							}
						default:
							return;
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
	
	public void printError(ArrayList<String> args, int errorIndex) {
		int errorCharStart = 0;
		StringBuffer error = new StringBuffer();
		error.append("Error: Invalid command.\n\n");
		for(int i = 0; i < args.size(); i++) {
			error.append(args.get(i));
			error.append(" ");
			
			if(errorIndex != 0 && errorIndex > i)
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
