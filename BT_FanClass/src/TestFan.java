public class TestFan {
    public static void main(String[] args) {
        FanClass fan = new FanClass();
        fan.setSpeed(2);
        System.out.println(fan.getSpeed());
        fan.turn();
        fan.ToString();
    }
}
