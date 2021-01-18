import java.io.*;
class CheckedException {
	public static void main(String args[])
	{
		try{
		File file = new File("/file.txt");
		FileReader fileReader = new FileReader(file);
		System.out.println("Successful");
	}catch(IOException e){
		System.out.println("File is not found....");
	}
	}
}	
