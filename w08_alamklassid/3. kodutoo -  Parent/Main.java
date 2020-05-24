public class Main {
    public static void main(String[] args) {

        Apartment Ap1 = new Apartment();
        Ap1.User = "Salme";
        Ap1.Gender = "She";
        Ap1.ApNumber = 1;
        Ap1.ApArea = 26;
        Ap1.ApInfo();

        Apartment Ap2 = new Apartment();
        Ap2.User = "Viktor";
        Ap2.Gender = "He";
        Ap2.ApNumber = 2;
        Ap2.ApArea = 49;
        Ap2.ApInfo();

        Staircase FirstBlock = new Staircase();
        FirstBlock.BlockNumber = 1;
        FirstBlock.isClean = false;
        FirstBlock.StaircaseInfo();
    }
}