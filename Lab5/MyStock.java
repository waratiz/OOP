package Lab5;

class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentprice;

    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousPrice(double p){
        previousClosingPrice = p;
    }

    public void setCurrentPrice(double c){
        currentprice = c;
    }

    public double getChangePercent(){
        return ((currentprice - previousClosingPrice)/previousClosingPrice*100);
    }

    public double getPreviousPrice(){
        return previousClosingPrice;
    }

    public double getCurrentPrice(){
        return currentprice;
    }

}

public class MyStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");

        stock.setPreviousPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.print("Previos closing price: "+stock.getPreviousPrice() +"\n");
        System.out.print("Current price: "+stock.getCurrentPrice()+"\n");
        System.out.print("Price change: "+stock.getChangePercent()+" %");
    }   
}
