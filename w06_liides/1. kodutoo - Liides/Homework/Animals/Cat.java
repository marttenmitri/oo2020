public class Cat implements AnimalBehaviour{

    public static void main(String[] args) {
        Cat miisu = new Cat();
        System.out.println(miisu.attack());
    }

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
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
		return true;
	}

	@Override
	public boolean defend() {
		// TODO Auto-generated method stub
		return false;
	}
}