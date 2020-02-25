//19 kakao 1`st problem
import java.util.HashMap;

public class OpenChatManage{
	private String[] record= new String[100000];
    private HashMap<String, String> userDate = new HashMap<>();
    private int n =0;

    public void setRecord(String ID, String NickName){
        this.userDate.put(ID, NickName);
    }

    public String getRecord(String ID){
        return userDate.get(ID); 
    }
    
    public void saveRecord(String s) {
    	this.record[n] = s;
    	n++;
    }
    public void changeNickname(String ID, String NickName) {
    	for(int i=0; i<record.length; i++) {
    		if(record[i]==null) {
    			break;
    		}
    		else {
    			if(record[i].contains(ID)) {
    				record[i]=record[i].replace(userDate.get(ID),NickName);
    			}
    		}
    	}
    }
    
    public void printRecord() {
    	for(int i=0; i<record.length; i++) {
    		if(record[i]==null) {
    			break;
    		}
    		else {
    			System.out.println(record[i]);
    		}
    	}
    }
}
