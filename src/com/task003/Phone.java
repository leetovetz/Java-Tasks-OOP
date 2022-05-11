package com.task003;

import java.util.List;

public class Phone {
    private int phoneNumber;

    public Phone() {
    }

    public Phone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call(int number, List<Integer> numbersList) {
        List<Integer> list = numbersList;

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(number)) {
                System.out.println("The dialed number does not exist");
            } else {
                System.out.println("Call the number " + number);
            }
        }
    }
}
