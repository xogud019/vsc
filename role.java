public class role{
    private boolean headManager= false;
    private boolean localManager = false;
    private boolean visitor = false;

    public role(int n){
        switch(n){
            case 1 : this.headManager = true;
            break;
            case 2 : this.localManager = true;
            break;
            case 3 : this.visitor = true;
            break;
        }
    }
}