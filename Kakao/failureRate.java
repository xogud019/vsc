//19 kakao 2
package Kakao;
public class failureRate {
	int[] stages;
	double[] failRate;
	
	public failureRate(int n) {
		this.stages = new int[n];
		for(int i=0; i<n; i++) {
			this.stages[i]=(i+1);
		}
		this.failRate = new double[n];
	}
	
	public void print() {
		for(int i=0; i<stages.length; i++) {
			System.out.print(stages[i]+" ");
		}
	}
	
	public double[] fRate(int n, int[] stages) {
		int count=0;
		int totalNum = stages.length;
		double temp= 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<stages.length; j++) {
				if(stages[j]==(i+1)) {
					count++;
				}
			}
			if(totalNum==0&&i==(n-1)) {
				failRate[i]=0;
				
			}
			else {
				temp = (double)count/(double)totalNum;
				totalNum -=count;
				count=0;
				failRate[i]=temp;
		
			}
		}
		return failRate;
	}
	
	public void sort(double[] n){
        for(int i=0; i<n.length;i++){
            for(int j=0; j<n.length-1;j++){
                double temp;
                int temp1;
                if(n[j]<n[j+1]){
                    temp= n[j];
                    temp1 = stages[j];
                    n[j] = n[j+1];
                    stages[j] = stages[j+1];
                    n[j+1]=temp;
                    stages[j+1]=temp1;
                }
                else if(n[j]==n[j+1]) {
                	double temp2;
                	int temp3;
                    if(n[j]>n[j+1]){
                        temp2= n[j];
                        temp3= stages[j];
                        n[j] = n[j+1];
                        stages[j] = stages[j+1];
                        n[j+1]=temp2;
                        stages[j+1]=temp3;
                    }
                }
            }
        }
    }
}