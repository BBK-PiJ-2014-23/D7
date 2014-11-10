public class InstanceCounter {
    public static void main(String[] args) {
        Spy spy1 = new Spy(005);
        Spy spy2 = new Spy(006);
        spy2.die();
        Spy spy3 = new Spy(007);
        Spy psy4 = new Spy(004);
        spy3.die();
    }
}