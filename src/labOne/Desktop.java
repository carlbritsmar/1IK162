package labOne;
public class Desktop extends Computer{

   public Desktop(int processorspeed, int memory, int storageSize, boolean hasDVD, boolean wirelessEnabled, double basePrice){
       super(processorspeed, memory, storageSize, hasDVD, wirelessEnabled, basePrice);
   }


   public double calculateProcessorPrice() {
       double cpuPrice = 0;
       if (processorspeed == 2){
           cpuPrice = 249;
       } else if (processorspeed == 3) {
           cpuPrice = 299;
       } else if (processorspeed == 4) {
            cpuPrice = 349;
       }
        return cpuPrice;
    }
    
    public double calculateMemoryPrice() {
        double memoryPrice = 0;
        if (memory == 8){
            memoryPrice = 100;
        } else if (memory == 16) {
            memoryPrice = 149;
        } else if (memory == 32) {
            memoryPrice = 199;
        }
        return memoryPrice;
    }


    public double calculateStoragePrice() {
       double storagePrice = 0;
       if (storageSize == 128){
           storagePrice = 99;
       } else if (storageSize == 256) {
           storagePrice = 149;
       } else if (storageSize == 512) {
           storagePrice = 199;
       }
        return storagePrice;
    }
    public double calculateShippingCost() {
        return calculatePrice() * 0.1;
    }
    public double calculatePrice() {
       double price;
       double features = 0;
       if (hasDVD){
           features = 70;
       } else if (hasDVD == true && wirelessEnabled) {
           features = 70 + 45;
       } else if (wirelessEnabled) {
           features = 45;
       }
       price = features + storageSize + memory + basePrice;
        return price;
    }
}
