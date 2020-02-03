//j112
public class CardLaw{
    public boolean thirdCardPlayer(int x){
        boolean isC =false;
        if(x<6){
            isC= true;
        }
        return isC;
    }

    public boolean thirdCardDealer(int x, int y){
        boolean isC = false;
        if(x<3){
            isC = true;
        }
        else if(x ==3 && y!=8){
            isC = true;
        }
        else if(x ==4 &&(y>1&&y<8)){
            isC = true;
        }
        else if(x ==5 &&(y>3&&y<8)){
            isC = true;
        }
        else if(x ==6 &&(y>5&&y<8)){
            isC = true;
        }
        return isC;
    }

    public boolean stand(int x, int y){
        boolean isC = false;

        if(x>5&&x<8){
            if(x==y){
                isC= true;
            }
            isC = true;
        }
        else if(y==7){
            isC = true;
        }
        return isC;
    }

    public boolean natural(int x, int y){
        boolean isE = false;
        if(x>7&&x<10){
            isE= true;
        }
        else if(y>7&&y<10){
            isE=true;
        }
        return isE;
    }
}