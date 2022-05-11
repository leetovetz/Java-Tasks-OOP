package com.task003;

/**
 * Describe the Phone class. Also describe the Network class (mobile operator's network).
 * The phone must have a method of registration in the mobile operator's network.
 * Also the phone must have a call method (number of another phone), which will search
 * all the phone numbers registered in the network. If such a number is found,
 * then make a call, if not - display a message that the dialed number is wrong
 */

public class PhoneSolution {
    public static void main(String[] args) {
        Phone phone1 = new Phone(452887);
        Phone phone2 = new Phone(455855);
        Phone phone3 = new Phone(459872);
        Phone phone4 = new Phone(458844);
        Phone phone5 = new Phone(457811);
        Phone phone = new Phone();
        Network network = new Network();

        network.connectNumberToNetwork(phone1.getPhoneNumber());
        phone.call(459872, network.getList());
    }
}
