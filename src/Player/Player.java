package Player;

import java.io.*;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Player {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {

            Scanner scan = new Scanner(System.in);

            File file = new File("ThatNiggaGay.wav");

            AudioInputStream audio = AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            String choice = "";

        while(!choice.equals("Q")) {

            System.out.println("P : Play, S : Skip to best part, St : Stop, Q : Quit");
            System.out.print("Enter a choice : ");


            choice = scan.next();
            choice = choice.toUpperCase();

            switch (choice) {

                case ("P"):
                    clip.start();
                    clip.setMicrosecondPosition(0);
                    clip.loop(9999);
                    break;

                case ("S"):
                    clip.setMicrosecondPosition(38000000);
                    break;

                case ("ST"):
                    clip.stop();
                    break;

                case ("Q"):
                    clip.close();
                    System.out.println("Thank you for using :)");
                    break;


                default:
                    System.out.println("Invalid Choice!");
                    break;


            }



        }

        System.out.println(clip.getFormat() + " format audio was used.");

    }


}