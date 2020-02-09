package Assignment;

import java.util.Scanner;

public class Registration {
    String playerName;
   //AddSports[] as = new AddSports[100];
    Scanner sc = new Scanner(System.in);
    Registration[] r = new Registration[10];
    AddSports[] as =  new AddSports[10];

    void registration(int p) {

        for (int i=0;i<p;i++) {
            r[i] = new Registration();
            System.out.println("Enter the name");
            r[i].playerName = sc.next();
            as[i] = new AddSports();
            System.out.println("Sport you intrested");
            as[i].sportName = sc.next();
        }


    }

    public void display() {
            for (Registration r1: r)
            {
                //r=new Registration[m];
                if(r1 == null){
                    break;
                }
                System.out.println("\tPlayers: " + r1.playerName);
            }
        }
    }

