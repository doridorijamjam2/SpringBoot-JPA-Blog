package kr.or.shi;
import java.util.ArrayList;

/*
java.until 패키지에서 제공되는 ArrayList
기존 배열 선언시 배열의 길이를 정하고 요소의 개수가 배열의 길이보다 커지면 배열을 재할당하고 복사해야 함.
객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해주는 클래스
주요메서드
boolean add(E e) : 요소 하나를 배열에 추가함
int size(): 배열에 추가된 요소 전체 개수를 반환함
E remove (int index) : 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환함.
E get(int index) : 배열의 index 위치에 있는 요소 값을 반환함.
  */


public class ArrayListTest {

    public static  void main(String[] args){
        ArrayList<Book> libaray= new ArrayList<>();

        libaray.add(new Book("IT의 리더 자리", "마크 슈워츠"));
        libaray.add(new Book("디지털 포렌식과 사고대응", "제라드 요한센"));
        libaray.add(new Book("Kotlin in Action", "드미트리 제메로프"));
        libaray.add(new Book("프리젠테이션 젠", "가르 레이놀즈"));
        libaray.add(new Book("파이썬 기반 강화학습 알고리즘", "안드레아 론자"));

    }



}
