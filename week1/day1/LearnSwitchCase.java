package week1.day1;

public class LearnSwitchCase {
	
	public static void main(String[] args) {
		
		char browser = 'd';
		
		switch (browser) {
		case 'c':
			System.out.println("Open Chrome browser");
		break;
		case 'e':System.out.println("Open Edge browser");break;
		case 'f':System.out.println("Open Firefox browser");break;
		case 'i':System.out.println("Open IE browser");break;
		case 's':System.out.println("Open Safari browser");break;
		default: System.out.println("Open default browser");
		}
		
		
	}

}
