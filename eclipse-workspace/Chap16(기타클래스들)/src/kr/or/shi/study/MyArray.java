package kr.or.shi.study;


public class MyArray {
	
	
	int[] intArr;       //int 배열
	int count;          //개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999; 
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int [ARRAY_SIZE];
		
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int [ARRAY_SIZE];
		
	}
	
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 충분하지 않습니다");
			return;
		}
		intArr[count++] = num ;
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다");
		}
		for(int i=0; i<count; i++) {
			System.out.println(intArr[i]);
		}
	}

	public void insertElement(int position, int num) {
		int i;
		if(count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 충분하지 않습니다.");
		}
		if(position < 0 || position > count) {
			System.out.println("insert 에러.");
		
		return;
	}
	for(i=count-1; i>=position; i--) {
		intArr[i+1] = intArr[i];
	}
	
	intArr[position] = num;
	count++;
	}

	public boolean isEmpty() {
		if(count ==0)
			return true;
		else
			return false;
	}

	public int removeElement(int position) {
		int result = ERROR_NUM;
		int i;
		
			if(isEmpty()) {
				System.out.println("아무것도 없습니다.");
				return result;
			}
			
			if(position < 0 || position >= count) {
				System.out.println("삭제 오류입니다.");
				return result;
			}
			
			result = intArr[position];
			
			for(i= position; i<count-1; i++) {
				intArr[i] = intArr[i+1];
			}
			count--;
			
			
			
			return result;
		
	}
	
	public void removeAll() {
		for(int i=0; i<count; i++) {
			intArr[i] = 0;
		}
		count = 0;
	}
	
	public int getElement(int position) {
		
		if(position < 0 || position > count-1) {
			System.out.println("해당 위치값이 존재하지 않습니다.");
			return ERROR_NUM;
		}
		
		return intArr[position];
		
	}
	
	public int getSize() {
		return count;
	}
	
	

}
