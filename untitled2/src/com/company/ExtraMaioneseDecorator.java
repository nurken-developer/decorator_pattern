package com.company;

public class ExtraMaioneseDecorator extends ExtraAdditionDecorator {


    public ExtraMaioneseDecorator(Consumation consumation){

        this.consumation = consumation;
    }

    @Override
    public String getProductName() {

        return consumation.getProductName()+ " with extra mayonnaise";
    }

    @Override
    public double getPrice() {

        return consumation.getPrice()+0.20;
    }
}
