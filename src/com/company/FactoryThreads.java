package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.out;

public class FactoryThreads {

    public static List<Transport> transports = new ArrayList<>();
    private int countConsume;
    private int CAPACITY;
    private static AtomicInteger countFullness = new AtomicInteger(0);


    public FactoryThreads(int count, int capacity) {
        this.countConsume = count;
        this.CAPACITY = capacity;

        Runnable producer = () -> {
            int i = 0;
            while (i < countConsume) {
                Transport transport = generateTransport();
                try {
                    addTransport(transport);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        };

        Runnable consumer = () -> {
            for(int i = 0; i < countConsume; i++){
                try {
                    grabTransport();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
    }

    public synchronized void addTransport(Transport transport) throws InterruptedException {
        if (countFullness.intValue() == CAPACITY) {
            wait();
        }

        notifyAll();
        transports.add(transport);
        countFullness.incrementAndGet();
        out.println("\nAdd one " + transport.toString());
    }

    public synchronized void grabTransport() throws InterruptedException {

        if (countFullness.intValue() == 0) {
            wait();
        }

        Thread.sleep(500);
        notifyAll();
        if (!transports.isEmpty()) {
            out.println("\nGrab one " + transports.get(countFullness.intValue() - 1).toString());
            transports.remove(countFullness.intValue() - 1);
            countFullness.decrementAndGet();
        }
    }

    public Transport generateTransport() {

        Transport transport = null;
        Random random = new Random();
        int field = random.nextInt(4);

        switch (field) {
            case 0:
                transport = new Airplane("H2000", 120, "vertical");
                break;
            case 1:
                transport = new Glider("H2000", 23);
                break;
            case 2:
                transport = new Helicopter("H2000", 120, 5);
                break;
            case 3:
                transport = new WaterTransport("H2000");
                break;
            default:
                break;
        }

        return transport;
    }
}
