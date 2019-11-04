package B1;

/**
 * Created by sity on 28/10/2019.
 */
public class TestFan {
public static void main (String[] args){
    Fan fan1 = new Fan();
    fan1.setColor("yellow");
    fan1.setRadiuse(10);
    fan1.setSpeed(3);
    Fan fan2=new Fan();
    fan2.getColor();
    fan2.setRadiuse(5);
    fan2.setSpeed(2);
    fan2.seton(false);
    fan1.seton(true);
    System.out.println(fan1);
    System.out.println(fan2);
}
}
