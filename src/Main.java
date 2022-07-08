public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 5000;
        int milesForBonus = service.calculate(ticketPrice);
        System.out.println(milesForBonus);
    }
}
