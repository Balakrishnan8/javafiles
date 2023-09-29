class Box
{
double width;
double heigth;
double depth;
}

class BoxInstance
{

static Box boxes(){
Box b1 = new Box();
b1.width = 10;
b1.heigth = 10;
b1.depth = 10;
return b1;
}

public static void main(String [] args)
{
System.out.println(boxes().width);
}

}