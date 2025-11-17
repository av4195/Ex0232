package com.example.ex0232;

public class Heavy extends Vehicles{
    private int towing;

    public Heavy(String carID,int carAge, int weels,String weelType,int pollotionPerMin, int towing){
        super(carID, carAge, weels,weelType,pollotionPerMin);
        this.towing = towing;
    }

    public int getTowing(){
        return towing;
    }

    public void setTowing(int towing){
        this.towing = towing;
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
        return super.toString() + " towing= " + this.towing;
    }

    @Override
    public int exhaust(){
        return super.exhaust()+(towing*500);
    }
}
