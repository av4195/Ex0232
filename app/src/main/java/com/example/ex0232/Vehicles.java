package com.example.ex0232;

public class Vehicles {
    private  String carID;
    private int carAge;
    private int weels;
    private String weelType;
    private int pollotionPerMin;

    public Vehicles(String carID,int carAge, int weels,String weelType,int pollotionPerMin){
        this.carID = carID;
        this.carAge = carAge;
        this.weels = weels;
        this.weelType = weelType;
        this.pollotionPerMin=pollotionPerMin;
    }

    public String getCarID(){
        return this.carID;
    }

    public int getCarAge(){
        return this.carAge;
    }
    public int getWeels(){
        return this.weels;
    }

    public String getWeelType(){
        return this.weelType;
    }

    public int getPollotionPerMin(){
        return this.pollotionPerMin;
    }

    public void setCarID(String carID){
        this.carID = carID;
    }
    public void setCarAge(int carAge){
        this. carAge = carAge;
    }

    public void setWeels(int weels){
        this.weels = weels;
    }

    public void setWeelType(String weelType){
        this.weelType = weelType;
    }

    public void setPollotionPerMin(int pollotionPerMin){
        this.pollotionPerMin = pollotionPerMin;
    }

    public String toString(){
        return "carID = " + this.carID + " carAge = " + this.carAge + "weels= " + this.weels + " weeltype= " + this.weelType + " pollotionPerMin= " + this.pollotionPerMin;
    }

    public int exhaust(){
        return pollotionPerMin*60;
    }

}
