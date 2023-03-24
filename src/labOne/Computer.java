package labOne;

abstract class Computer {
    protected int processorspeed;
    protected int memory;
    protected int storageSize;
    protected boolean hasDVD;
    protected boolean wirelessEnabled;
    protected double basePrice;

    Computer (int processorspeed, int memory, int storageSize, boolean hasDVD, boolean wirelessEnabled, double basePrice){
     this.processorspeed = processorspeed;
     this.memory = memory;
     this.storageSize = storageSize;
     this.hasDVD = hasDVD;
     this.wirelessEnabled = wirelessEnabled;
     this.basePrice = basePrice;
    }
    public abstract double calculateProcessorPrice();
    public abstract double calculateMemoryPrice();
    public abstract double calculateStoragePrice();
    public abstract double calculatePrice();
    public abstract double calculateShippingCost();
}
