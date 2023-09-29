import java.io.*;

class ShowFile
{
public static void main(String [] args)
{
int i;
FileInputStream f;

if(args.length!=1)
{
	System.out.println("No file is attached");
	return;
}

try
{
f = new FileInputStream(args[0]);
}catch(FileNotFoundException e)
{
	System.out.println(e.getMessage());
	return;
}

try{
	do{
	i = f.read();
	if(i!=-1) System.out.print((char) i);
	}while(i!=-1);
}
catch (IOException e){
	System.out.println(e);
}

try
{
	f.close();
	System.out.println("File read successfully...");
}
catch (IOException e)
{
	System.out.println(e);
}


}
}