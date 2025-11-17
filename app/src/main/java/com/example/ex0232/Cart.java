package com.example.ex0232;

public class Cart extends Light{
    private double loadingTime;

    public Cart(String carID,int carAge, int weels,String weelType,int pollotionPerMin, boolean doesHaveEngine, double loadingTime){
        super(carID,carAge,weels,weelType,pollotionPerMin,doesHaveEngine);
        this.loadingTime = loadingTime;
    }

    public double getLoadingTime(){
        return this.loadingTime;
    }
    public void setLoadingTime(double loadingTime){
        this.loadingTime = loadingTime;
    }

    @Override
    public boolean getDoesHaveEngine(){
        return super.getDoesHaveEngine();
    }

    @Override
    public void setDoesHaveEngine(boolean doesHaveEngine) {
        super.setDoesHaveEngine(doesHaveEngine);
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
        return super.toString() + " loadingTime= " + this.loadingTime;
    }

    @Override
    public int exhaust() {
        return 0;
    }

}
