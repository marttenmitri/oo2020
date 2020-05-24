public class Main {
    public static void main(String[] args) {
        
        String text = "Kokku on vallavanemale ja haigla nõukogule saadetud pöördumisele oma nime alla pannud 24 töötajat, nende seas ka mitu Saaremaal tuntud arsti.";
        TextManipulate t = new TextManipulate(text);
        t.printLastLetters();
        t.printMap();
    }
}