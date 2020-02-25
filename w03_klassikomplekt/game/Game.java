import java.util.Scanner;

/**
 * Main
 */
public class Game {

    public static void main(String[] args) {

        Character player = new Character("Mitri", CharacterType.GOBLIN);
        Character enemy = new Character("Sipsik", CharacterType.WIAZARD);

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();


        player.slogan = "hey";


        System.out.println(player);
        System.out.println(player.direction);

        player.move();
        System.out.println(player);
        System.out.println(enemy);
        player.changeDirection(Direction.RIGHT);

        player.move();
        player.move();
        player.move();

        String input = "";

        while(!input.equals("end")){
            input = scanner.nextLine();

            if(input.equals("")) player.move();
         else if (input.equals("w")){
            player.changeDirection(Direction.UP);
            player.move();
        }else if (input.equals("s")){
            player.changeDirection(Direction.DOWN);
            player.move();
        }else if (input.equals("a")){
            player.changeDirection(Direction.LEFT);
            player.move();
        }else if (input.equals("d")){
            player.changeDirection(Direction.RIGHT);
            player.move();
        }
    // pooleli
        if(player.x == enemy.x && player.y == enemy.y){

        }
    //pooleli
    }
        
    }

    
}