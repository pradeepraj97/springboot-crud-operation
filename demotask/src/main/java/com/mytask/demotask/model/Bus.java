package com.mytask.demotask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus")

public class Bus {
@Id
@Column(name="busid")
    private int busid;
@Column(name="busname")
private String busname;
@Column(name="busroute")
private String busroute;
@Column(name="ticketprice")
private int ticketprice;

    public int getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(int ticketprice) {
        this.ticketprice = ticketprice;
    }



    public String getBusroute() {

        return busroute;

    }

    public void setBusroute(String busroute) {
        this.busroute = busroute;
    }

    public String getBusname() {

        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    @Column


    public int getBusid() {
        return busid;
    }

    public void setBusid(int busid) {
        this.busid = busid;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busid=" + busid +
                ", busname='" + busname + '\'' +
                ", busroute='" + busroute + '\'' +
                ", ticketprice=" + ticketprice +
                '}';
    }
}