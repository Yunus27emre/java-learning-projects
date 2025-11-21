
public class Stack {
Object[] array;
int front;

  	Stack(int size){
		array=new Object[size];
		front=-1;
	}
  void push(Object variable) {
	  if(isFull()) {
		  System.out.println("Array is full.");
	  }else {
		  front++;
		  array[front]=variable;
	  }
  }
  
  Object peek() {
	  Object temp;
	  temp=array[front];
	  return temp;
  }
  
  Object pop() {
	if(isEmpty()) {
		System.out.println("Array is empty.");
		return null;
	}else {
		Object temp;
		temp=array[front];
		front--;
		return temp;
	}
  }
  
  boolean isEmpty() {
	  return front==-1;
  }
  
  boolean isFull() {
	  return front==array.length-1;
  }
 Integer size() {
	return front+1;
	
}


}
