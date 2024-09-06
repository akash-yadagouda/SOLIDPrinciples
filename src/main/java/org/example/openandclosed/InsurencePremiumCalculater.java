package org.example.openandclosed;

public class InsurencePremiumCalculater {
    public int calculateInsurencepremium(CustomerProfile customerProfile){
            if(customerProfile.isGoodCustomer()){
                return 10;
            }
            return -1;
    }
}
