 class StackEmptyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
public class StackUsingArray{
	private int[] data;
	private int top;
	public StackUsingArray(){
		data =new int[10];
		top=-1;
	}
	public StackUsingArray(int capacity) {
		data=new int[capacity];
		top=-1;
	}
	public boolean isEmpty() {
	return(top==-1);
	}
	
	public int size() {
	return(top+1);	
	}
	
public int top() throws StackEmptyException {
	if(top==-1) {
		StackEmptyException e=new StackEmptyException();
		throw e;}
	
	return data[top];
	}

public void push(int elem)  {
	if(size()==data.length) {
		int[] doubledata=new int[data.length*2];
		int i=0;
		for(i=0;i<data.length;i++) {
			doubledata[i]=data[i];
		}
		doubledata[i]=elem;
		data=doubledata;
	}
	
	top++;
	data[top]=elem;
}

public int pop() throws StackEmptyException {
	if(top==-1) {
		StackEmptyException e=new StackEmptyException();
		throw e;
	}
	top--;
	return data[top+1];
}
