package Assignment;




import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);

    static AddSports[] asArray =  new AddSports[50];
    static Game[] gamesArray = new Game[50];
    static Player[] players = new Player[50];


    public static void main(String[] args){
        Application.showMenu();
    }

    private static void showMenu(){
        while(true){
            System.out.println("===================================================");
            System.out.println("1. Add Sports");
            System.out.println("2. Registeration ");            
            System.out.println("3. Create Schedule");
            System.out.println("4. Display Schedule");
            System.out.println("5. Display ");
            System.out.println("Please make a choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :{
                    addSport();break;
                }
                case 2 :{
                    registration();break;
                }
                case 3 :{
                    createSchedule();break;
                }
                case 4 :{
                    System.out.println("\t 1.Day Wise");
                    System.out.println("\t 2.Player Wise");
                    System.out.println("\t 3.Game Wise");
                    System.out.println("\t 4.Main Menu");
                    System.out.println("\t Select your choice ");
                    int ch = sc.nextInt();
                    if(ch == 1 ){
                            dayWise();
                            showMenu();
                    }
                    else if (ch ==2) {
                        playerWise();
                        showMenu();
                    }

                    else if (ch ==3) {
                        gameWise();
                        showMenu();
                    }
                           
                    else if (ch ==4){
                        continue;
                    }
                }
                case 5 :{
                    display();
                }

                case 6 :{
                    System.exit(0);
                }
            }
        }
    }
/*display() method will display all players, sports , Game and day*/
    private static void display() {
        System.out.println("Display Players");
        displayPlayer();
        System.out.println("Display Sports");
        displaySport();
        System.out.println("Display Games and Day");
        displayGame();
        showMenu();
    }
/* createSchedule() */
    private static void createSchedule() {
        System.out.println("Available Sports");
        displaySport();
        System.out.println("Available Players");
        displayPlayer();
        System.out.println("How many games?");
        int num=sc.nextInt();
        for (int i=0;i<num;i++) {
            System.out.println("On which day?");
            String day1=sc.next();
            System.out.println("Enter game");
            String game = sc.next();

            gamesArray[i]=new Game();
            gamesArray[i].gameName = game;
            gamesArray[i].gameDay =  day1;

            if (asArray[i].sportName.equals(game)){
                System.out.println(game+" is Scheduled!!");
            }else {
                System.out.println(game+" is not present");
            }
        }
    }

    private static void addSport() {
        System.out.println("How many sports you want to add?");
        int s = sc.nextInt();
        for (int i = 0;i<s;i++){
            asArray[i] = new AddSports();
            System.out.println("Enter sport");
            asArray[i].sportName =sc.next();
        }
    }

    private static void dayWise() {
    System.out.println("Enter the day:");
    String day = sc.next();
        for (Game g : gamesArray) {
            if (g == null) {
                break;
            }
            if (g.gameDay.equals(day)) {
                System.out.println("GameName : " + g.gameName + " Day: " + g.gameDay);
            }
            for (Player player : players) {
                if (player == null) {
                    break;
                }
                if (player.sport.equals(g.gameName)) {
                    System.out.println("\tPlayers: " + player.playerName + "\t Games: " + player.sport);
                }
            }
        }
    }

    private static void playerWise() {
        System.out.println("Enter the Player Name:");
        String name = sc.next();

            for (Player player : players) {
                if (player == null) {
                    break;
                }
                if (player.playerName.equals(name)) {
                    System.out.println("Players: " + player.playerName + "\t Games: " + player.sport);
                }

                for (Game g : gamesArray) {
                    if (g == null) {
                        break;
                    }
                    if (g.gameName.equals(player.sport)) {
                        System.out.println("\tGameName : " + g.gameName + " Day: " + g.gameDay);
                    }
            }
        }
    }

    private static void gameWise() {
        System.out.println("Enter the Game:");
        String game = sc.next();
        for (Game g : gamesArray) {
            if (g == null) {
                break;
            }
            if (g.gameName.equals(game)) {
                System.out.println("\tGameName : " + g.gameName + " Day: " + g.gameDay);
            }
            for (Player player : players) {
                if (player == null) {
                    break;
                }
                //System.out.println(g.gameName);
                if (g.gameName.equals(player.sport)) {
                    System.out.println("Players: " + player.playerName + "\t Games: " + player.sport);
                }
            }
        }
    }


    private static void registration(){
        System.out.println("Available Sports");
        displaySport();
        System.out.println("How many player you want to enter?");
        int p = sc.nextInt();
        for (int i=0;i<p;i++) {

            System.out.println("Enter the name");
            String name = sc.next();

            System.out.println("Sport you want to play");
            String sport = sc.next();
            players[i]=new Player();
            players[i].playerName = name;
            players[i].sport = sport;
        }

//        rg.registration(p);
//        rg.display();
    }

    private static void displaySport() {
        for (AddSports a:asArray){
            if(a == null){
                break;
            }
            System.out.println("\tSport : "+a.sportName);
        }
    }

    private static void displayPlayer() {
        for (Player p: players)
        {

            if(p == null){
                break;
            }
            System.out.println("\tPlayer Name: " + p.playerName+"\tSport: "+p.sport);
        }
    }

    private static void displayGame() {

        for (Game g : gamesArray) {
            if (g == null) {
                break;
            }
            System.out.println("\tGameName : " + g.gameName + " Day: " + g.gameDay);
        }
    }
}
