package kr.or.shi.etcstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization(직렬화)
 *   - 인스턴스의 상태를 그대로 파일저장하거나 네트웍으로 전송(Serialization)하고 다시 복원(deserialization)하는 방식
 *   - 자바에서는 보조 스트림을 활용해서 직렬화 제공함.
 *   -ObjectInputStream, ObjectOutputStream
 *   
 * Serialization 인터페이스
 *   - 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함.  
 *   - 구현 코드가 없는 marker interface.
<<<<<<< HEAD
=======
 *   - transient : 직렬화 하지 않으려는 멤버 변수에 사용함. (Socket등 직렬화 할수 없는 객체)
>>>>>>> 4d6bab5 (21day)
 */

class Person implements Serializable{
	String name;

	String job;     

	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() { return name + ", " + job;}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "대표이사");
		Person personLee2 = new Person("이연", "대리");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);         //serialization
			oos.writeObject(personLee2);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person pLee = (Person)ois.readObject();         //deserialization
			Person pLee2 = (Person)ois.readObject();        //직렬화를 복원
			
			System.out.println(pLee);
			System.out.println(pLee2);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
