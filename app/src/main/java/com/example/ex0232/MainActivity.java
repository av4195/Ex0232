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

        Bicycle i = new Bicycle("76",7,4,"m",5,true,true);
        Truck e = new Truck("j",3,4,"k",1,2,1);
        Regular j = new Regular("h",1,1,"h",5,5);
        Tractor k = new Tractor("n",2,5,"jh",2,2,"h");


        Vehicles[] v = {i,j,e,k};
        int[] m = {1,5,6,2,20,5};
        sumDailyPollotion(v);
    }

    public int sumDailyPollotion(Vehicles[] m){
        int sum=0;
        for (int i = 0; i < m.length; i++) {
            sum = sum+ m[i].exhaust();
        }
        return sum;
    }

    public void showNoise(Vehicles[] m){
        for (int i = 0; i < m.length; i++) {
            if (m[i] instanceof Regular) {
                ((Regular) m[i]).noise();
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

    public String maxChargeTime(Vehicles[] m){
        int maxIndex = 0;
        double maxLoading = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] instanceof Cart){
                if(((Cart) m[i]).getLoadingTime() > maxLoading){
                    maxLoading = ((Cart) m[i]).getLoadingTime();
                    maxIndex = i;
                }
            }
        }
        return m[maxIndex].getCarID();
    }

}