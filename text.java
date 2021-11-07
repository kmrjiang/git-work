package git;

import java.util.Scanner;

public class text {
    public static void main(String args[])throws Exception{
        Scanner sr=new Scanner(System.in);
        String str=sr.next();
        IParams ip=IParking.parse();
        ParkingSystem ps=new ParkingSystem(1,1,0);
        ps.PlanParkingnumber= ip.getPlanParking();//[1231]
        for (int i = 0; i < ps.PlanParkingnumber.size(); i++) {
            System.out.print(ps.addCar(ps.PlanParkingnumber.get(i))+" ");
        }
    }
}
