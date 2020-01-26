public enum j38E{
    PHY(23),MIND(25),EMO(28);
    private final int peiValue;
    
    j38E(int pei){
        this.peiValue = pei;
    }

    public int getPei(){
        return peiValue;
    }
}