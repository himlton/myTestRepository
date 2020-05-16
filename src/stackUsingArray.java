import org.apache.commons.lang3.ArrayUtils;

public class stackUsingArray {
	
	int stackArray[];
    int peek = -1;
   int size;

    stackUsingArray(int size){
    	this.size = size;
        this.stackArray = new int[size];
    }

    public void addIntoStack(int addValue){
    	if(size == (peek+1)) {
    		System.out.println("Stack is full and can't add any more values");
    	}
    	else {
    	peek++;
        stackArray[peek]=addValue;
     
       System.out.println("Data " + stackArray[peek]+" has been added into stack successfully.");
       System.out.println("Value of peek: " + peek);
    	}
    }
    
    public int currentSizeOfStack() {
    	return peek+1;
    }
    
    public void delateFromStack(){
    	if(peek == -1) {
    		System.out.println("Stack is empty");
    	}
    	else {
    		int count = peek;
    		peek--;
    		System.out.println("Number deleated from stack is: --> "+ stackArray[count]);
    		ArrayUtils.remove(stackArray, count);
    	}
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackUsingArray stack = new stackUsingArray(10);
		stack.addIntoStack(100);
		stack.addIntoStack(200);
		stack.addIntoStack(300);
		stack.addIntoStack(400);
		
		stack.addIntoStack(500);
		stack.addIntoStack(600);
		stack.addIntoStack(700);
		stack.addIntoStack(800);
		stack.addIntoStack(900);
		stack.addIntoStack(1000);
		stack.addIntoStack(1100);
		System.out.println(stack.currentSizeOfStack());
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
		stack.delateFromStack();
	}

}
