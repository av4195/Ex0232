package com.example.ex0232;

import java.util.ArrayList;
import java.util.List;

public class Kibbutz {
    private Vehicles[] v;
    private int carSum;

    public Kibbutz(){
        this.v = new Vehicles[500];
        this.carSum = 0;
    }

    public void addVehicle(Vehicles n){
        this.v[carSum] = n;
    }

    public List<Vehicles> f(){
        List<Vehicles> arrylList= new ArrayList<>();
        for (int i = 0; i < carSum; i++) {
            if(this.v[i].getCarAge() > 15){
                if(this.v[i].getWeelType().equals("hege")){
                    arrylList.add(this.v[i]);
                }
            }
        }
        return arrylList;
    }

    public int h(){
        int sum=0;
        for (int i = 0; i < carSum; i++) {
            if(this.v[i].getWeelType().equals("hege")){
                if(!(this.v[i] instanceof Heavy)){
                    sum = sum+1;
                }
            }
        }
        return sum;
    }
}
