package kr.or.shi.bankApp;

import java.util.Scanner;

public class BankApp {
	
	//배열 100개 정적멤버로 생성, 배열이므로 한계가 있음(메모리 낭비)
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금하기 | 4.출금하기 | 5.종료하기 ");
			System.out.println("선택> ");
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				createAccount();
			}
			else if(choice == 2) {
				accountList();
				
			}
			else if(choice == 3) {
				deposite();
				
			}
			else if(choice == 4) {
				withdraw();
				
			}
			else if(choice == 5) {
				System.out.println("계좌관리 프로그램을 종료합니다.");
				run = false;
			}
			else {
				System.out.println("계좌를 잘못 입력했습니다.");
			}
		
		}
		
	}
	//출금하기
	public static void withdraw() {
		System.out.println("--------------------------------------------------------");
		System.out.println("출금합니다.");
		System.out.println("--------------------------------------------------------");
		
		System.out.print("계좌번호 입력 : ");
		String ano = scan.next();
		System.out.print("출금액 : ");
		int money2 = scan.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		
		
		if(account.getBalance() - money2 < 0) {
			System.out.println("출금 금액이 없습니다. 다시 입력하세요.");
			return;
		}
		else {
			account.setBalance(account.getBalance() - money2);
			System.out.println("결과 : 출금이 성공했습니다. 현재 잔액 : " + account.getBalance());
		}	
		
	} 
	
	//계좌찾기
	public static Account findAccount(String ano) {
		
		Account account = null;
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				//매개변수로 넘어온 ano(계좌번호)동일하다면
				if(accountArray[i].getAno().equals(ano)){
					account = accountArray[i];
				}
			}
		}
		
		return account;
	}
	
	//예금하기
	public static void deposite() {
		System.out.println("--------------------------------------------------------");
		System.out.println("예금합니다.");
		System.out.println("--------------------------------------------------------");
		
		System.out.print("계좌번호 입력 : ");
		String ano = scan.next();
		System.out.print("예금액 : ");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공했습니다. 현재 잔액 : " + account.getBalance());
		
		
	}
	public static void accountList() {
		System.out.println("--------------------------------------------------------");
		System.out.println("계좌를 출력합니다.");
		System.out.println("--------------------------------------------------------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.println("\t");
			}
		}
	}
	
	public static void createAccount() {
		System.out.println("--------------------------------------------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("계좌 번호 : ");
		
		//next() : 한단어를 입력할때 용이한 메서드 (공백을 발견하면 그 앞까지만 String리턴)
		//nextLine() : 한문장이나 한 줄로 입력받을 때 용이한 메서드		
		String ano = scan.next();
		
		System.out.println("계좌주 : ");
		String owner = scan.next();
		
		System.out.println("초기 입금액 : ");
		int balance = scan.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌 생성 완료되었습니다.");
				System.out.println(accountArray[i].getAno() + ", " + accountArray[i].getOwner() + ", " + accountArray[i].getBalance());
				
				break;
			}
			
		}
	}

}
