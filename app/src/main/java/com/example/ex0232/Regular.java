package com.example.ex0232;

import android.widget.TextView;

public class Regular extends Vehicles{
    TextView tv;

    private int passengerNumber;

    public Regular(String carID,int carAge, int weels,String weelType,int pollotionPerMin,int passengerNumber){
        super(carID,carAge,weels,weelType,pollotionPerMin);
        this.passengerNumber= passengerNumber;
    }

    public int getPassengerNumber(){
        return this.passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber){
        this.passengerNumber = passengerNumber;
    }
    @Override
    public String getCarID(){
        return super.getCarID();
    }

    @Override
    public int getCarAge(){
        return super.getCarAge();
    }

    @Override
    public int getWeels(){
        return super.getWeels();
    }
    @Override
    public String getWeelType(){
        return super.getWeelType();
    }
    @Override
    public int getPollotionPerMin(){
        return super.getPollotionPerMin();
    }

    @Override
    public void setCarID(String carID){
        super.setCarID(carID);
    }
    @Override
    public void setCarAge(int carAge){
        super.setCarAge(carAge);
    }

    @Override
    public void setWeels(int weels){
        super.setWeels(weels);
    }
    @Override
    public void setWeelType(String weelType){
        super.setWeelType(weelType);
    }
    @Override
    public void setPollotionPerMin(int pollotionPerMin){
        super.setPollotionPerMin(pollotionPerMin);
    }

    @Override
    public String toString(){
        return super.toString() + " passengerNumber= " + this.passengerNumber;
    }

    @Override
    public int exhaust() {
        return super.exhaust() + 20;
    }

    public void noise(){
        System.out.print("noise level: 66");
    }

    public void hitchhikers(){
        System.out.println("hitchhikers on regular car");
    }
}
