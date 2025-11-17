package com.example.ex0232;

public class Heavy extends Vehicles{
    private int towingCapacity;

    public Heavy(String carID,int carAge, int weels,String weelType,int pollotionPerMin, int towingCapacity){
        super(carID, carAge, weels,weelType,pollotionPerMin);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity(){
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity){
        this.towingCapacity = towingCapacity;
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
        return super.toString() + " towingCapacity= " + this.towingCapacity;
    }
}
