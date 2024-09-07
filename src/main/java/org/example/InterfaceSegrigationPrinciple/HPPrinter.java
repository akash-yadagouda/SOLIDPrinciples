package org.example.InterfaceSegrigationPrinciple;

import org.example.InterfaceSegrigationPrinciple.Interface.IPrint;
import org.example.InterfaceSegrigationPrinciple.Interface.IScan;

public class HPPrinter implements IScan, IPrint {
    @Override
    public void print() {
        System.out.println("I am priting");
    }

    @Override
    public void scan() {
        System.out.println("I am scaning");
    }
}
