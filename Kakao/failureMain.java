//19 kakao 2
package Kakao;
import java.util.Scanner;

public class failureMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("input Num(1~500) : ->");
			int N= scan.nextInt();
			
			if(N>500) {
				System.out.println("Num must under the 500");
				System.out.println("progran end");
				break;
			}
			
			System.out.print("input stage`num(1~200,000) : ->");
			int stageNum= scan.nextInt();
			
			if(stageNum>200000) {
				System.out.println("stage`num must under the 200,000");
				System.out.println("progran end");
				break;
			}
			
			int[] stages = new int[stageNum];
			for(int i=0; i<stages.length; i++) {
				stages[i] = (int)(Math.random()*(N+1))+1;
			}
			for(int i=0; i<stages.length-1; i++) {
				System.out.print(stages[i]+",");
			}
			System.out.println(stages[stageNum-1]);
			double[] temp = new double[stageNum];
			failureRate fR = new failureRate(N);
			temp = fR.fRate(N, stages);
			for(int i=0; i<temp.length-1; i++) {
				System.out.print(temp[i]+", ");
			}
			System.out.println(temp[N-1]);
			
			fR.sort(temp);
			for(int i=0; i<temp.length; i++) {
				System.out.print(temp[i]+" ");
			}
			System.out.println();
			fR.print();
		}
	}
}