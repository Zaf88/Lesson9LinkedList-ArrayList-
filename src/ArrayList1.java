import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {

    public static void main(String[] args) {
        String Car1 = "name:Toyota,maxSpeed:200,horsePower:180,weight:1500";
        String Car2 = "name:Subaru,maxSpeed:250,horsePower:280,weight:2500";
        String Car3 = "name:BMW,maxSpeed:300,horsePower:350,weight:2700";
        String Car4 = "name:Honda,maxSpeed:280,horsePower:300,weight:2800";

        ArrayList<String> carList = new ArrayList<>();
        carList.add(Car1);
        carList.add(Car2);
        carList.add(Car3);
        carList.add(Car4);
        System.out.println(carList);
    }}


