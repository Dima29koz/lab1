package second;

public class Ball {
    private String firm;
    private int price;

    public Ball (String firm_){
        firm = firm_;
        price = 0;
    }
    public Ball (String firm_, int price_){
        firm = firm_;
        price = price_;
    }
    public void setPrice (int price_){
        this.price = price_;
    }
    public void setFirm (String firm_){
        this.firm = firm_;
    }
    public String getFirm(){
        return firm;
    }
    public int getPrice (){
        return price;
    }
    public String toString(){
        return this.firm+" price "+this.price;
    }
    public void toUSD(){
        System.out.println( this.firm+" price "+this.price/75);
    }

}
