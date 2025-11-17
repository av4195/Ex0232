package com.example.ex0232;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bicycle bicycle = new Bicycle("76152",2,4,"Steel Wheels",50,false,true);
        Truck truck = new Truck("254a1",3,4,"Alloy Wheels",1,2,1);
        Regular regular = new Regular("45addl2",1,4,"Chrome Wheels",15,5);
        Tractor tractor = new Tractor("1ildl22wa",2,4,"Forged Wheels",20,7,"work");


        Vehicles[] v = {bicycle,truck,regular,tractor};
        int[] m = {1,5,6,2,20,5};
        sumDailyPollotion(v);
    }

    public int sumDailyPollotion(Vehicles[] v){
        int sum=0;
        for (int i = 0; i < v.length; i++) {
            sum = sum+ v[i].exhaust();
        }
        return sum;
    }

    public void showNoise(Vehicles[] vehicle){
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] instanceof Regular) {
                ((Regular) vehicle[i]).noise();
            }
        }
    }

    public int passengers(Vehicles[] m){
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] instanceof Regular){
                sum = sum+ ((Regular) m[i]).getPassengerNumber() -1;
            } else if (m[i] instanceof Bicycle) {
                if(((Bicycle) m[i]).getBasket()== true){
                    sum = sum+1;
                }
            }
        }
        return sum;
    }

    public String maxChargeTime(Vehicles[] v){
        int maxIndex = 0;
        double maxLoading = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Cart){
                if(((Cart) v[i]).getLoadingTime() > maxLoading){
                    maxLoading = ((Cart) v[i]).getLoadingTime();
                    maxIndex = i;
                }
            }
        }
        return v[maxIndex].getCarID();
    }

}