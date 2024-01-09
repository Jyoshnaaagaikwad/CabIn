package org.example;

public class Invoice {
    static  final double costperkm=10.0;
    static final double costpermin=1.0;
    static final double min_fare=5;
    public double CalcualtorFare(double distance,int time){
        double totalfare=(distance*costperkm)*(time*costperkm);
        if(totalfare<5){
            return min_fare;
        }
        return totalfare;
    }
}
