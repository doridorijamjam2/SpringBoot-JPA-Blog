package kr.or.shi.study03;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
		
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("Heap Sort 입니다.");
	}
	

}
