package com.example.ex0232;

public class SchoolBus extends Regular{
    private int stopsNumber;

    public SchoolBus(String carID,int carAge, int weels,String weelType,int pollotionPerMin,int passengerNumber, int stopsNumber){
        super(carID,carAge,weels,weelType,pollotionPerMin,passengerNumber);
        this.stopsNumber = stopsNumber;
    }

    public int getStopsNumber(){
        return this.stopsNumber;
    }

    public void setStopsNumber(int stopsNumber){
        this.stopsNumber=stopsNumber;
    }

    @Override
    public int getPassengerNumber(){
        return super.getPassengerNumber();
    }

    @Override
    public void setPassengerNumber(int passengerNumber){
        super.setPassengerNumber(passengerNumber);
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
        return super.toString() + " stopsNumber= " + this.stopsNumber;
    }
}
