public class Currency{
    
    private double value;

    private Coin_material coin_material;
    private Coin_name coin_name;

    public Currency(Coin_name coin_name, Coin_material coin_material){
        this.coin_name = coin_name;
        this.coin_material = coin_material;
        
        if(this.coin_name == Coin_name.MAINCOIN){
            this.value = 1.0;
        }else if(this.coin_name == Coin_name.GOBLINCOIN){
            this.value = 2.0;
        }else if(this.coin_name == Coin_name.WARRIORCOIN){
            this.value = 5.0;
        }else if(this.coin_name == Coin_name.WIZARDCOIN){
            this.value = 0.5;
        }else{
            this.value = 0.0;
        }
        
    }

    public String toString(){
        return "Coin is called " + coin_name + " and it is made from "+ coin_material + ".\nOne " + coin_name + " is worth " + value + " MainCoins";
    }
}

