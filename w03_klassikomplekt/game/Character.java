public class Character{

    public int x;
    public int y;

    String slogan = "";

    private String name;
    private CharacterType characterType;
    public Direction direction;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;
        this.direction = direction.UP;

        this.x = 30;
        this.y = 30;
    }

    public String toString(){
        return "My name is " + name + " and i am at x: "+ x + " y: " + y + " and my slogan is " + slogan;
    }
    void changeDirection(Direction direction){
        this.direction = direction;
    }

    String getXY(){
        return name + " is at x: "+ x + " y: " + y;
    }

    void move(){
        switch (this.direction) {
            case UP:
                this.y++;
                break;

            case RIGHT:
                this.x++;
                break;

            case LEFT:
                this.x--;
                break;

            case DOWN:
                this.y--;
                break;
        
            default:
                break;
        }
        System.out.println(getXY());
    }
}