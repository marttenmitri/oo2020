import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Game {

    public static void main(String[] args) {

        World world = new World(20, 10);
        Character player = new Character("Mitri", CharacterType.PLAYER, "P");
        Character enemy = new Character(5, 5, "Sipsik", CharacterType.MONSTER, "M");
        Character npc = new Character(3, 3, "helper", CharacterType.NPC, "N");

        world.addCharacters(Arrays.asList(enemy,npc,player));

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();

        String input = "";

        world.render();

        while(!input.equals("end")){
            input = scanner.nextLine();

            if(input.equals("")) player.move();
         else if (input.equals("w")){
            player.changeDirection(Direction.UP);
        }else if (input.equals("s")){
            player.changeDirection(Direction.DOWN);
        }else if (input.equals("a")){
            player.changeDirection(Direction.LEFT);
        }else if (input.equals("d")){
            player.changeDirection(Direction.RIGHT);
        }

        if(player.x == npc.x && player.y == npc.y){
            enemy.isVisible = enemy.isVisible == true ? false : true;

        }

        world.render();
    }
        
    }

    
}