package com.sibsutis.devices;

public abstract class Device {
    protected int id;
    protected int price;
    protected String ip;

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }
    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public String getIp(){
        return ip;
    }

    @Override
    public String print() {
        return "ID: " + id + ", Price: " + price + ", IP: " + (ip != null ? ip : "N/A");
    }

    public abstract String getDeviceType();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        return id == device.id &&
                price == device.price &&
                java.util.Objects.equals(ip, device.ip);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, price, ip);
    }
}
