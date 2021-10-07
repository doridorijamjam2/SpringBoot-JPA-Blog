package kr.or.shi.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) {
		
		List<String> vector = new Vector<>();
		File file = new File("words.txt");
		System.out.println("파일크기 : " + file.length()/1024 + "kb");
		
		try {
			Scanner fscan = new Scanner(file);
			
			while(fscan.hasNext()) {
				vector.add(fscan.next());
			}
			
			fscan.close();
			
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			boolean found = false;
			System.out.println("찾을 단어 입력(종료는 exit) >> ");
			String search = scan.next();
			
			//검색종료코드
			if(search.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			for(int i=0; i<vector.size(); i++) {
				String vs = vector.get(i);         //백터내의 문자열을 가져옴.
				if(search.equals(vs)) {
					System.out.println("찾은 문자 : " + vs);
					found = true;
				}
			}
			
			if(!found) {
				System.out.println("찾는 단어가 없습니다.");
			}
		}
		
		
		
		scan.close();
		
   

	}

}
