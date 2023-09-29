class Stack
{
	int stack[] = new int [10];
	int top;

	Stack()
	{
		top =-1;
	}

	void push(int ele)
	{
		if(top == 9)
			System.out.println("Stack is overflow");
		else
			stack[++top] = ele;
	}

	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is Underflow");
			return 0;
		}
		else
			return stack[top--];
	}

}

public class TestStack
{
	public static void main(String [] args)
	{

		Stack s1 = new Stack();

		for(int i=0;i<10;i++)
		{
			s1.push(i);
		}

		for(int j=0;j<10;j++)
		{
			System.out.println(s1.pop());
		}

	}
}