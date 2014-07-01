import java.util.*;
import java.io.*;

public class ListFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] vec = new String [500]; 
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Type directory name");
		String directory = sc.nextLine();
		File file = new File(directory);
		if (file.exists()){
			if (file.isDirectory()) {
				System.out.println("Directory found!");
				vec = file.list();
				for (String i:vec)
					System.out.println(i);
			}
			else
				System.out.println("The file " + directory + " is not a directory.");
		}
		else
			System.out.println("The file "+ directory + " does not exist.");
		
		
			
        
	}

}