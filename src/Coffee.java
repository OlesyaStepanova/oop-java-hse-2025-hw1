// Source code is decompiled from a .class file using FernFlower decompiler.
public class Coffee {
    private String name;
    private double basePrice;
 
    public Coffee(String name, double basePrice) {
       this.name = name;
       this.basePrice = basePrice;
    }
 
    public String getName() {
       return this.name;
    }
 
    public void setName(String name) {
       this.name = name;
    }
 
    public double getBasePrice() {
       return this.basePrice;
    }
 
    public void setBasePrice(double basePrice) {
       this.basePrice = basePrice;
    }
 
    public double calculatePriceWithSugar(Sugar sugar) {
       return this.basePrice + sugar.getSugarPrice();
    }
 }
 