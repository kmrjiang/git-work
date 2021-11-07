package git;
import java.util.*;
public class ParkingSystem implements IParking{
    int big;
    int medium;
    int small;
    int bignum=0;
    int mediumnum=0;
    int smallnum=0;
    public static ArrayList<Integer> PlanParkingnumber;
    public ParkingSystem(int big,int medium,int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int cartype) {
        if(cartype==1){
            if(bignum<big){
                bignum++;
                return true;
            }else{
                return false;
            }
        }
        else if(cartype==2){
            if(mediumnum<medium){
                mediumnum++;
                return true;
            }else{
                return false;
            }
        }
        else if(cartype==3){
            if(smallnum<small){
                smallnum++;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public void prase()
    {
        System.out.println("123");
    }
    //加入prase方法
    public void print(String input) {
        String regex="\\p{Punct}";
        String [] str=input.split(regex);
        boolean [] math=new boolean[str.length];
        String out=null;
        for (int i=0;i<str.length;i++){
            math[i]=addCar(Integer.parseInt(str[i]));
            System.out.print(math[i]+" ");
        }
    }
}






