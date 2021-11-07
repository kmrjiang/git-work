package git;
import java.util.ArrayList;
public class par implements IParams{
    public ArrayList<Integer> getPlanParking =new ArrayList<Integer>(100);
    public int getBig() {
        int number = 0;
        for (int i=0;i<getPlanParking.size();i++){
            if(getPlanParking.get(i) ==1){
                number++;
            }
        }
        return number;
    }
    public int getMedium() {
        int number = 0;
        for (int i=0;i<getPlanParking.size();i++){
            if(getPlanParking.get(i) ==2){
                number++;
            }
        }
        return number;
    }
    public int getSmall() {
        int number = 0;
        for (int i=0;i<getPlanParking.size();i++){
            if(getPlanParking.get(i) ==3){
                number++;
            }
        }
        return number;
    }
    public ArrayList<Integer> getPlanParking() {
        this.getPlanParking.add(1);
        this.getPlanParking.add(2);
        this.getPlanParking.add(3);
        this.getPlanParking.add(1);
        return  getPlanParking;
    }
}
