package Assignment;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;



public class Schedule {
    Scanner sc = new Scanner(System.in);
    Game[] gamesArray = new Game[100];
    AddSports[] asArray =  new AddSports[100];

//    void createSchedule(){
//
//        System.out.println("On which day?");
//        String day1=sc.next();
//        //dayArray[]
//        System.out.println("How many games?");
//        int num=sc.nextInt();
//        for (int i=0;i<num;i++) {
//            System.out.println("Enter game");
//            String game = sc.next();
////            as[i] = new AddSports();
//            gamesArray[i]=new Game();
//            gamesArray[i].gameName = game;
//            gamesArray[i].gameDay =  day1;
//
//            if (asArray[i].sportName.equals(game)){
//                System.out.println(game+" is Scheduled!!");
//            }else {
//                System.out.println(game+" is not present");
//            }
//        }
//    }

    void createSchedule1() {
        System.out.println("On which day?");
        String day1=sc.next();
        System.out.println("How many games?");
        int num=sc.nextInt();
        AddSports s = new AddSports();
        for (int i=0;i<num;i++) {
            System.out.println("Enter game");
            String game = sc.next();
//            as[i] = new AddSports();
            if (game.equals(s.sportName)){
                System.out.println(game+"Scheduled!!");
            }else {
                System.out.println(game+" is not present");
            }
        }




        System.out.println("");

    }
}


