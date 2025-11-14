package com.sibsutis.devices;

public class Phone extends Device {

    public Phone(int id, int price) {
        super(id, price, null);
    }

    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "Phone";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        return obj instanceof Phone;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
