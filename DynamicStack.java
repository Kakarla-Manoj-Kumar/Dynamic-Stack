package DynamicStack;

public class DynamicStack {
	int capacity=2;
	int dStack[]=new int [capacity];
	int top=0;

	public void push(int data) {
    
	if(size()==capacity)
		expand();
	 dStack[top]=data;
	 top++;
     
		
	}
	private void expand() {
		int length = size();
		
		int newStack[]=new int[capacity*2];
		System.arraycopy(dStack, 0, newStack, 0, length);
		dStack=newStack;
		capacity*=2;
		
	}
	public void show() {
		for(int n:dStack) {
			System.out.print(n+" ");
		}
		System.out.println();
		
	}


	public int pop() {
		int data=0;
		if(top<=0) {
			System.out.println("Stack is empty");
		}
		else {
		top--;
		data=dStack[top];
		dStack[top]=0;
		shrink();
		}
		return data;
	}
	


	private void shrink() {
		int length=size();
		if(length<=(capacity/2)/2)
         capacity=capacity/2;
		int newStack[]=new int[capacity];
		System.arraycopy(dStack, 0, newStack, 0, length);
		dStack=newStack;
		
	}
	public int size() {
		return top;
	}
	public int peek() {
	int data;
	data=dStack[top-1];
	return data;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	
	


}
