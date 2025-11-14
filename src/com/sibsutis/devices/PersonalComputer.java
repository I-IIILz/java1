package com.sibsutis.devices;

public class PersonalComputer extends Device{

    public PersonalComputer(int id,int price){
        super(id, price,null);
    }
    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }


    public String getDeviceType(){
        return "PersonalComputer";
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        return obj instanceof PersonalComputer;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

