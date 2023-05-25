public class Month {
 int starting;
 int ending;
    public Month(int n){
        if(n==1) {
            starting = 0;
            ending = 31;
        }
        else if(n==2) {
            starting=3;
            ending=28;
        }
        else if(n==3) {
            starting=3;
            ending=31;
        }
        else if(n==4) {
            starting=6;
            ending=30;
        }
        else if(n==5) {
            starting=1;
            ending=31;
        }
        else if(n==6) {
            starting=4;
            ending=30;
        }
        else if(n==7) {
            starting=6;
            ending=31;
        }
        else if(n==8) {
            starting=2;
            ending=31;
        }
        else if(n==9) {
            starting=5;
            ending=30;
        }
        else if(n==10) {
            starting=0;
            ending=31;
        }
        else if(n==11) {
            starting=3;
            ending=30;
        }
        else if(n==12) {
            starting=5;
            ending=31;
        }
    }
}
