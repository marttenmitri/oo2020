public class Character_wallet{


    private String name;
    private Coin_name coin_name;
    private int quantity;

    public Character_wallet(String name, Coin_name coin_name,int quantity ){
        this.name = name;
        this.coin_name = coin_name;
        this.quantity = quantity;

    }

    public String toString(){
        return name + " has " + quantity + " " + coin_name + "s ";
    }
}