package B1;

/**
 * Created by sity on 27/10/2019.
 */
public class Fan {
    private final int SLOW=1;
    private final int MEDION=2;
    private final int FAST=3;
    private int speed;
    private boolean on;
    private double radiuse;
    private String color;
    public Fan(){
        this.speed=1;
        this.on=false;
        this.radiuse=5;
        this.color="blue";
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public boolean geton (){
        return this.on;
    }
    public void seton(boolean on){
        this.on=on;
    }
    public double getRadiuse(){
        return this.radiuse;
    }
    public void setRadiuse(double radiuse){
        this.radiuse=radiuse;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        if (this.on==true)
            return Integer.toString(this.speed) + " " + this.color + " " + Double.toString(this.radiuse);
        else
            return this.color + " " + Double.toString(this.radiuse)+ " " + " Fan is off " ;
    }

}
