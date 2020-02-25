public class Character{

    public int x;
    public int y;
    public boolean isVisible = true;

    String slogan = "";
    private String symbol = "?";

    private String name;
    private CharacterType characterType;
    public Direction direction;

    public Character(String name, CharacterType characterType, String symbol){
        this.name = name;
        this.characterType = characterType;
        this.direction = direction.RIGHT;
        this.symbol = symbol;

        this.x = 1;
        this.y = 1;
    }

    public Character(int x, int y, String name, CharacterType characterType, String symbol){
        this.name = name;
        this.characterType = characterType;
        this.direction = direction.RIGHT;
        this.symbol = symbol;

        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "My name is " + name + " and i am at x: "+ x + " y: " + y + " and my slogan is " + slogan;
    }

    String getSymbol(){
        return this.symbol;
    }

    void changeDirection(Direction direction){
        this.direction = direction;
        move();
    }

    void move(){
        switch (this.direction) {
            case UP:
                this.y--;
                break;

            case RIGHT:
                this.x++;
                break;

            case LEFT:
                this.x--;
                break;

            case DOWN:
                this.y++;
                break;
        
            default:
                break;
        }
        System.out.println(this);
    }
}