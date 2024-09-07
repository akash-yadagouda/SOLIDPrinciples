package org.example.LiskovaSubstitutePrinciple;

public class InHouseProduct extends Product {


    public InHouseProduct(int discount){
        super(discount);
    }

    @Override
    public int getDiscount(){
        return (int) (1.5 * discount);
    }

}
