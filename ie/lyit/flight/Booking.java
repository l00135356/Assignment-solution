package ie.lyit.flight;

import java.util.ArrayList;

public class Booking {

    private Flight inbound;
    private Flight outbound;
    private double totalPrice;
    private static int count;
    private double sum;
    private ArrayList < Passenger > passengers;

    public Booking() {
        outbound = new Flight();
        inbound = new Flight();
        outbound = null;
        totalPrice = 0.0;
        sum = 0.0;
        passengers = new ArrayList < Passenger > ();
        count++;
    }

    public Booking(Flight oF, Flight iF, ArrayList < Passenger > p) {
        this.outbound = oF;
        this.inbound = iF;
        this.passengers = p;
        count++;
    }

    public String toString() {
        return ("Outbound Flight: " + outbound + "Inbound Flight: " + inbound + "");
    }
    public double calculatePrice() {
        sum = inbound.getPrice() + outbound.getPrice();
        totalPrice = sum * passengers.size();
        return totalPrice;
    }
    public boolean findPassenger(Passenger p) {
        for (Passenger i: passengers) {
            if (i.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        Booking eObject;
        if (obj instanceof Booking)
            eObject = (Booking) obj;
        else
            return false;
        Booking temp = (Booking) obj;
        return temp.outbound == outbound && temp.inbound == inbound;
    }

    public void setOutBound(Flight outbound) {
        this.outbound = outbound;
    }
    public void setInBound(Flight inbound) {
        this.inbound = inbound;
    }

    public Flight getInbound() {
        return inbound;
    }
    public Flight getOutBound() {
        return outbound;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}