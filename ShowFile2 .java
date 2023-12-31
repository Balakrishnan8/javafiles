import java.io.*;
class ShowFile2 {
	public static void main(String args[]){
		int i;
		if(args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		try(FileInputStream fin = new FileInputStream(args[0])) {
			System.out.println(fin);
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		} 
		catch(FileNotFoundException e) {
 			System.out.println("File Not Found.");
 		} catch(IOException e) {
 			System.out.println("An I/O Error Occurred");
 		}
 	}
}