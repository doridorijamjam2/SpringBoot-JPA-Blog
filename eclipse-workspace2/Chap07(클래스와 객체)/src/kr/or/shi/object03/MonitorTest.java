package kr.or.shi.object03;

public class MonitorTest {
	
	public static void main(String[] args) {
		
		
		//monitor 참조변수는 리모컨과 같은 역할
		Monitor monitor = new Monitor();
		//System.out.println(monitor);
		monitor.power();
		monitor.power();
		monitor.power();
		System.out.println();
		
		monitor.channel = 5;
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		monitor.channelDown();
		monitor.channelUp(); 
		System.out.println();
		
		
		monitor.volumeUp();
		monitor.volumeUp();
		monitor.volumeDown();
		monitor.volumeUp();
		monitor.volumeUp();
		System.out.println();
		
		System.out.println(monitor);
		monitor.power();
		
	}

}
