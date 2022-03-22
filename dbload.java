package assignment1;
import java.io.*;

public class dbload {
	public static void main(String[] args) throws Exception {
		int pagesize = 0;
		String inputFile = "";
		if(args.length != 4) {
			System.out.println("Wrong Command, Please enter 'java dbload -p pagesize datafile' to load data");
		}else if(!args[1].equals("-p")){
			System.out.println("Wrong Command, Please enter 'java dbload -p pagesize datafile' to load data");
		}else {
			pagesize = Integer.parseInt(args[2]);
			inputFile = args[3];
		}
		String outputFile = "heap." + String.valueOf(pagesize);
		InputStream inputstream = new FileInputStream(inputFile);
	}
}
