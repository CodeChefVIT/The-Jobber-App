package com.anuj.thejobberapp.item;

import java.sql.Time;

public class Job {
    String Desc;
    float price;
    int bids;
    Time time;

    public Job(String Description, Time time_left, float MoneyOffered){
        Desc=Description;
        time=time_left;
        price=MoneyOffered;
        bids=0;
    }
    public Job(String Description, float MoneyOffered){
        Desc=Description;
        price=MoneyOffered;
        bids=0;
    }

    public String getDesc() {
        return Desc;
    }

    public float getPrice() {
        return price;
    }

    public int getBids() {
        return bids;
    }

    public Time getTime() {
        return time;
    }

    public void addBid(){
        bids++;
    }
}
