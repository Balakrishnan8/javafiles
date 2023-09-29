import java.util.Scanner;

public class CaesarCipher
{

static String encrypt(String str, int key)
{
	key = key%26+26;
	String encrypted = new String();
	for(char ch:str.toCharArray())
	{
		if(Character.isLetter(ch))
		{
			if (Character.isUpperCase(ch))
			{
				encrypted+=(char)('A'+(((ch-'A')+key)%26));
			}
			else
			{
				encrypted+=(char)('a'+(((ch-'a')+key)%26));
			}
		}
		else
		{
			encrypted+=ch;
		}
	}
	return encrypted;
}

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Text: ");
	String str = sc.next();
	System.out.print("Enter Key: ");
	int key = sc.nextInt();
	String enc = encrypt(str, key);
	System.out.println("The Encrypted Text = "+enc);
	String dec = encrypt(enc, -key);
	System.out.println("The Decrypted Text = "+dec);
	
}

}