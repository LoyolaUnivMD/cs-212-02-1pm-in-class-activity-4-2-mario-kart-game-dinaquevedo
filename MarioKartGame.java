public class MarioKartGame {
    public static void main(String[] args){
        MarioKartPlayer player1 = new MarioKartPlayer("Player1", "Mario", 50);
        MarioKartPlayer player2 = new MarioKartPlayer("Player2", "Luigi", 45);

        System.out.println("Initial Information: ");
        player1.displayInfo();
        player2.displayInfo();
        System.out.println();

        player1.boost(20);
        player2.boost(15);

        System.out.println("Information after boost: ");
        player1.displayInfo();
        player2.displayInfo();
    }
}
