//j137
public class Hanoi{
    int tray =3;
    int bar =3;
    int [][] rings;

    public Hanoi(int tray){
        this.tray = tray;
        rings = new int[tray][bar];
        for(int i=0; i<rings.length; i++){
            int x =2*i+2;
            rings[i][0]=x;
        }
    }

    public int[][] getRings(){
        return rings;
    }

    public void moveHanoi(int num, char ringA, char ringB, char ringC){
        if(num==1){
            System.out.println(ringA+"->"+ringB);
        }
        else{
            moveHanoi(num-1, ringA, ringC, ringB);
            System.out.println(ringA+"->"+ringB);
            moveHanoi(num-1, ringC, ringB, ringA);
        }
    }

}