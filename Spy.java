public class Spy {
    private static int spyCount = 0;
    private int id;

    public Spy (int id) {
        this.id = id;
        spyCount++;
        System.out.println("This spy's ID is " + id + ". Spies so far: " + spyCount);
    }

    public void die() {
        spyCount--;
        System.out.println("Spy " + id + " has been detected and eliminated. Spies left: " + spyCount);
    }
}