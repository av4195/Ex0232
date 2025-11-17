package com.example.ex0232;

public class Tractor extends Heavy{
    private String type;

    public Tractor(String carID,int carAge, int weels,String weelType,int pollotionPerMin, int towing, String type){
        super(carID,carAge,weels,weelType,pollotionPerMin,towing);
        this.type = type;

    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public int getTowing(){
        return super.getTowing();
    }

    @Override
    public void setTowing(int towing){
        super.setTowing(towing);
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
        return super.toString() + " type= " + this.type;
    }
}
