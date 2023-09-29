public class ByteUnsignedShift
{
public static void main(String [] args)
{
byte b = (byte) 0xf1;
 byte c = (byte) (b >> 4);
 byte d = (byte) (b >>> 4);
 byte e = (byte) ((b & 0xff) >> 4);

System.out.println(b + " " + c  +" " + d + " " + e);
int k=10;
System.out.println(- ++k + k++);
}
}