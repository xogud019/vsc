//19 kakao 1`st problem
package Kakao;
import java.util.HashMap;

public class OpenChatManage{
	private String[] record= new String[100000];
    private HashMap<String, String> userData = new HashMap<>();
    private int n =0;

    public void setData(String ID, String NickName){
        this.userData.put(ID, NickName);
    }

    public String getData(String ID){
        return userData.get(ID); 
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
    				record[i]=record[i].replace(userData.get(ID),NickName);
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
