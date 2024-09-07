package org.example.InterfaceSegrigationPrinciple;

import org.example.InterfaceSegrigationPrinciple.Interface.IFax;
import org.example.InterfaceSegrigationPrinciple.Interface.IPrint;
import org.example.InterfaceSegrigationPrinciple.Interface.IScan;

public class XeroxWorkCenter implements IPrint, IScan, IFax {

    @Override
    public void fax() {
        System.out.println("I am faxing");
    }

    @Override
    public void print() {

        System.out.println("I am printing");

    }

    @Override
    public void scan() {

        System.out.println("I am scaning");

    }
}
