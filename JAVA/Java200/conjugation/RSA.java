//j136
import java.util.ArrayList;

public class RSA{
    public static final int START= 200;
    private int p=11;
    private int q=7;
    private int n;
    private int phiN;
    private int e;
    private int d;
    
    public void makePQ(){
        p=(int)(Math.random()*START);
        q=(int)(Math.random()*START);

        while((p==q)||(p<100||q<100)||(!isPrime(p)||!isPrime(q))){
            p=(int)(Math.random()*START);
            q=(int)(Math.random()*START);
        }
    }

    public void makeN(){
        n=p*q;
    }

    public int getN(){
        return n;
    }

    public void print(){
        System.out.println("p="+p+", q="+q);
        System.out.println("n="+n+", phi="+phiN);
        System.out.println("e="+e+", d="+d);
    }

    public void makePHIN(){
        this.phiN = (p-1)*(q-1);
    }
    
    public int getPhiN(){
        return phiN;
    }

    public void makeE(){
        ArrayList<Integer> es = new ArrayList<Integer>();
        for(int i=2; i<phiN; i++){
            if(gcd(phiN,i)==1){
                es.add(i);
            }
        }
        e= es.get(es.size()-1);
    }

    public void makeD(){
        int count =2;
        while(!(count*e%phiN==1&&count!=e)){
            count++;
        }
        d=count;
    }

    public int toCiph(int m){
        int tot=1;
        for(int i=0;i<e;i++){
            tot=(tot*m)%n;
        }
        return tot;
    }

    public int toUnCiph(int c){
        int tot=1;
        for(int i=0; i<d; i++){
            tot=(tot*c)%n;
        }
        return tot;
    }

    public static boolean isPrime(int n){
        boolean isT= true;
        for(int i=2; i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                isT=false;
                break;
            }
        }

        return isT;
    }

    public static int gcd(int num1, int num2){
        int result=0;
        int temp=0;

        if(num1>num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for(int i=2;i<=num1;i++){
            if((num1%i==0)&&(num2%i==0)){
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args){
        RSA aa = new RSA();
        aa.makePQ();
        aa.makeN();
        aa.makePHIN();
        aa.makeE();
        //aa.makeD();
        //aa.print();
        
    }
}