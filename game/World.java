import java.util.List;

/**
 * world
 */
public class World {

    private int width;
    private int height;
    List<Character> Characters;

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }

    void addCharacters(List<Character> c){
        this.Characters = c;

    }

    void render(){

        restrict();

        String symbol = "";

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                if(y == 0 || y == height-1){
                    symbol = "-";
                }else if(x == 0 || x == width-1){
                    symbol = "|";
                }else{
                    symbol = " "; 
                }

                for(Character c : Characters){
                    if(c.isVisible && c.x == x && c.y == y){
                        symbol = c.getSymbol();
                    }
                }

                System.out.print(symbol);     
            }
            System.out.println("");
            symbol = "";
        }

    }
    void restrict(){
        Character c = Characters.get(Characters.size() - 1);

        if (c.x == 0){
            c.x++;
        }else if(c.y == 0){
            c.y--;
        }else if(c.x == width){
            c.y++;
        }else if(c.y == width){
            c.y++;
        }
    }
}