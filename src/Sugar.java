// Source code is decompiled from a .class file using FernFlower decompiler.
public class Sugar {
    private String sugarLevel;
    private double sugarPrice;
 
    public Sugar(String sugarLevel, double sugarPrice) {
       this.sugarLevel = sugarLevel;
       this.sugarPrice = sugarPrice;
    }
 
    public String getSugarLevel() {
       return this.sugarLevel;
    }
 
    public void setSugarLevel(String sugarLevel) {
       this.sugarLevel = sugarLevel;
    }
 
    public double getSugarPrice() {
       return this.sugarPrice;
    }
 
    public void setSugarPrice(double sugarPrice) {
       this.sugarPrice = sugarPrice;
    }
 
    public String getSugarDescription() {
       return "Уровень сахара: " + this.sugarLevel;
    }
 }
 