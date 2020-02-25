//19 kakao 1`st problem
import java.util.Scanner;

public class openChatMain{
    public static void Main(String[] args){
        OpenChatManage mgr = new OpenChatManage();
        Scanner scan = new Scanner(System.in);
        String s1 = "Enter";
        String s2 = "Leave";
        String s3 = "Change";
        String s4 = "exit";
        
        while(true) {
        	System.out.println("--------------------------------");
        	System.out.println("(Enter/Leave/Change) uid nickName");
        	System.out.println("--------------------------------");
        	System.out.print(">");
        	String s = scan.nextLine();
        	//System.out.println(s);
        	String[] array = s.split(" ");
        	if(array[0].equals(s1)) {
        		//mgr.saveRecord(s);
        		//mgr.changeNickname(array[1], array[2]);
        		//mgr.setRecord(array[1],array[2]);
        		
        		if(mgr.getRecord(array[1])==null) {
        			mgr.saveRecord(s);
        			mgr.setRecord(array[1], array[2]);
        		}
        		else {
        			if((mgr.getRecord(array[1])).equals(array[2])) {
        				mgr.saveRecord(s);
        			}
        			else {
        				mgr.saveRecord(s);
            			mgr.changeNickname(array[1], array[2]);
            			mgr.setRecord(array[1], array[2]);
            			System.out.println("hi");
        			}
        			/*
        			mgr.saveRecord(s);
        			mgr.setRecord(array[1], array[2]);
        			mgr.changeNickname(array[1], array[2]);
        			*/
        		}
        		
        	}
        	else if(array[0].equals(s2)) {
        		mgr.saveRecord(s);
        	}
        	else if(array[0].equals(s3)) {
        		mgr.saveRecord(s);
        		mgr.changeNickname(array[1], array[2]);
        	}
        	else if(s.equals(s4)) {
        		break;
        	}
        	else {
        		System.out.println("plz chooze E/L/C");
        		System.out.println();
        	}
        	mgr.printRecord();
        }
    }
}