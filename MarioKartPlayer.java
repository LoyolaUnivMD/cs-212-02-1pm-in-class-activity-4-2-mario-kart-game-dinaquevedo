public class MarioKartPlayer {
//    playerName (String): The name of the player. character (String): The character chosen for the game (e.g., Mario, Luigi). speed (int): The current speed of the player.
    private String playerName;
    private String character;
    private int speed;

    public MarioKartPlayer (String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public void boost (int boostAmount){
        this.speed += boostAmount;
        System.out.println("Your boost has been activated! " + playerName + " accelerated to " + speed + " speed!");
    }

    public void displayInfo() {
        System.out.print("Player Name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        MarioKartPlayer player1 = new MarioKartPlayer("Player1", "Mario", 50);
        player1.displayInfo();
        player1.boost(20);
        player1.displayInfo();
    }

}
