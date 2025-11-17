package com.example.ex0232;

public class Bicycle extends Light{
    private  boolean basket;

    public Bicycle(String carID,int carAge, int weels,String weelType,int pollotionPerMin, boolean doesHaveEngine, boolean basket){
        super(carID,carAge,weels,weelType,pollotionPerMin,doesHaveEngine);
        this.basket = basket;
    }

    public boolean getBasket(){
        return this.basket;
    }

    public void setBasket(boolean basket){
        this.basket = basket;
    }

    @Override
    public boolean getDoesHaveEngine(){
        return super.getDoesHaveEngine();
    }

    @Override
    public void setDoseHaveEngine(boolean doseHaveEngine){
        super.setDoesHaveEngine(doseHaveEngine);
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
        return super.toString() + " basket= " + this.basket;
    }
}
