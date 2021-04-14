
package Latihan5;

public class Truck {
    public int cadence;
    public int gear;
    public int speed;
    
    public Truck (int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    public void setCadence (int newValue){
        cadence = newValue;
    }
     public void setGear (int newValue){
         gear = newValue;
     }
     public void applyBrake (int decrement){
         speed = decrement;
     }
     public void speedUp (int increment){
         speed = increment;
     }
}

