package com.lahiru.training.javabasics.enumerations;

public class Application {

    public static void main(String[] args) {

        Transport transport = Transport.BUS;

        if (transport == Transport.BUS){
            System.out.println("Transport is a BUS");
        }

        // take all enums and put them into a array
        Transport allTransports[] = Transport.values();

        for (Transport transports : allTransports) {
            System.out.print(transports + ", ");
        }

        System.out.println();

        ///////////////////////////////
        System.out.println("Train speed is: " + TransportWithSpeed.TRAIN.speed);


        //////////////////////////////// method ordinal
        // give exact position of given enum
        Transport transport1 = Transport.BOAT;
        System.out.println(transport1.ordinal());

    }

}
