public class Turtle implements AnimalBehaviour{

    public static void main(String[] args) {
        Turtle juss = new Turtle();
        System.out.println(juss.defend());
    }

    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println("mjau");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean beSneaky() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void lookAround() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean attack() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean defend() {
        // TODO Auto-generated method stub
        return true;
    }
    
}