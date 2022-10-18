package com.example.retos345.entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReportClient {
    private int total;
    private Client client;

    public ReportClient(Client client){
        this.client = client;
        this.total=client.getReservations().size();

        List<Reservation> ListReservation = new ArrayList<>(client.getReservations());
        Collections.sort(ListReservation, new Comparator<Reservation>(){
         @Override
         public int compare(Reservation r1, Reservation r2){
            return r1.getIdReservation().compareTo(r2.getIdReservation());
        }

        });
        Set<Reservation> hSet = new HashSet<Reservation>(ListReservation);
        this.client.setReservations(hSet);
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



    public int getTotal() {
        return total;
    }



    public void setTotal(int total) {
        this.total = total;
    }
    
}
