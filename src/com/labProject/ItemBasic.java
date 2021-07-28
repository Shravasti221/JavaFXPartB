package com.labProject;


import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;
import java.util.ArrayList;

public class ItemBasic{
    private SimpleFloatProperty price;
    private SimpleIntegerProperty space_per_unit;
    private SimpleIntegerProperty qty;
    private SimpleStringProperty producerID;
    private SimpleStringProperty unit;
    // in case of producer, the price he is selling at;
    //in case of consumer the price he is buying at.
    private SimpleStringProperty name;
    private SimpleStringProperty ID;

    ItemBasic(String ID, String Name, String Prod, String unit, int qty, float Price, int Space){
        this.ID = new SimpleStringProperty(ID);;
        this.name = new SimpleStringProperty(Name);
        this.price = new SimpleFloatProperty(Price);
        this.space_per_unit = new SimpleIntegerProperty(Space);
        this.qty = new SimpleIntegerProperty(qty);
        this.producerID = new SimpleStringProperty(Prod);
        this.unit = new SimpleStringProperty(unit);
    }


    //Issued by the godown classHK,/LL

    float getSpace(){
        return qty.get() * space_per_unit.get();
    }

    @Override
    public String toString() {
        return "The item " + name + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity=" + qty +
                '}';
    }
    public String getName(){
        return this.name.get();
    }

    public String getID() {
        return ID.get();
    }

    public int getQty() {
        return qty.get();
    }

    public float getAmount(){
        return qty.get() *price.get();
    }

    public float getPrice() {
        return price.get();
    }

    public String getUnit() {
        return unit.get();
    }

    public void setQty(int q) {
        this.qty = new SimpleIntegerProperty(q);
    }

    public void setPrice(float price) {
        this.price = new SimpleFloatProperty(price);
    }

    public String getProducerID(){
        return producerID.get();
    }


}
