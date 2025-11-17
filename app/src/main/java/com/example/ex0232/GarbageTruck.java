package com.example.ex0232;

public class GarbageTruck extends Truck{
    private double fuelAmount;

    public GarbageTruck(String carID,int carAge, int weels,String weelType,int pollotionPerMin, int towingCapacity, int carryWight, double fuelAmount){
        super(carID,carAge,weels,weelType,pollotionPerMin,towingCapacity, carryWight);
        this.fuelAmount = fuelAmount;
    }

    public double getFuelAmount(){
        return this.fuelAmount;
    }
    public void setFuelAmount(double fuelAmount){
        this.fuelAmount = fuelAmount;
    }

    @Override
    public int getCarryWight(){
        return super.getCarryWight();
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
    public void setCarryWight(int carryWight){
        super.setCarryWight(carryWight);
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
        return super.toString() + " fuelAmount= " + this.fuelAmount;
    }
}
