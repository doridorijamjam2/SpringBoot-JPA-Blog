package kr.or.shi.decision2;

public class SwitchNestedTest {

	public static void main(String[] args) {
		
		int number = 7;
		
		//정형화 된 값, 정해져 있는 값들에게는 switch문이 가독성이 좋음.
		switch(number) {
		   case 1:
		   case 7:
			   switch(number) {
			      case 1:
			    	  System.out.println("011 이신군요.");
			    	  break;
			      case 7:
			    	  System.out.println("017 이신군요.");
			    	  break;
			   }
			   
		}
			   
	       if(number == 6) {
	    	   System.out.println("016 이신군요.");
	       }
	       else if(number == 9) {
	    	   System.out.println("019 이신군요.");
	       }
	      
	       
			   
			   
			   
//		   case 6:
//		   case 9:
//			   switch(number) {
//			   case 6:
//				   System.out.println("016 이신군요.");
//				   break;
//			   case 9:
//				   System.out.println("019 이신군요.");
//				   break;
//			 
//			   
//		  
//			   }
	
		}

	}

