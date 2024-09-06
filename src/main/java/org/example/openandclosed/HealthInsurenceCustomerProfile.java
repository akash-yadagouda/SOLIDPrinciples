package org.example.openandclosed;

public class HealthInsurenceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isGoodCustomer() {
        return false;
    }
}
