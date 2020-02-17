/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Character mitri = new Character("Mitri", CharacterType.GOBLIN); mitri.slogan = "hey";
        Currency main_coin = new Currency(Coin_name.WARRIORCOIN , Coin_material.PLATINUM);
        Character_wallet mitri_wallet = new Character_wallet("mitri", Coin_name.WARRIORCOIN, 5);

        System.out.println(mitri);
        System.out.println(main_coin);
        System.out.println(mitri_wallet);
    }
}