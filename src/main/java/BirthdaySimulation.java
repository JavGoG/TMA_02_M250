
/**
 * Write a description of class BirthdaySimulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * <p>
 * (1)(a) Adding import statements.
 */

/**
 * (1)(a) Adding import statements.
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * (1)(b) New 'bdays' field and constructor.
 *
 */

public class BirthdaySimulation {
    public ArrayList<String> bdays;

    /**
     *  (1)(c) New 'ranMonth()' method.
     */
    public String ranMonth() {
        Random rand = new Random();
        int x = rand.nextInt(12);
        String month = "";
        switch (x) {
            case 0:
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
        }
        return month;
    }

    //    (1)(d) new ranDateInMonth method.
    public int ranDateInMonth(String aMonth) {

        Random rand = new Random();
        int x = rand.nextInt(4);
        int y = rand.nextInt(30);
        int z = rand.nextInt(29);
        int number = rand.nextInt();

        if (aMonth == "February") {
            if (x == 0) {
                return y;
            } else {
                return z;
            }
        }
        switch (aMonth) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "September":
            case "November":
                number = rand.nextInt(32);
                break;
            case "April":
            case "June":
            case "August":
            case "October":
            case "December":
                number = rand.nextInt(31);
                break;
        }
        System.out.println("Date: " + number);
        return number;
    }

    //    (1)(e) new createMeeting method.
    public void createMeeting(int numAttendees) {
        bdays.clear();
        BirthdaySimulation birthdaySimulation = new BirthdaySimulation();
        String bday = "";
        for (int i = 0; i < numAttendees; i++) {
            String month = birthdaySimulation.ranMonth();
            bday = "" + birthdaySimulation.ranDateInMonth(month) + " " + birthdaySimulation.ranMonth();
            bdays.add(bday);
        }
        System.out.println(bday);
    }

    // (1)(f) new foundMatch method.
    public boolean foundMatch()
    {
        boolean bool = false;
        for (int i = 0; i < bdays.size(); i++) {
            for (int j = 1; j < bdays.size(); j++) {
                if (bdays.get(i) == bdays.get(j)) {
                    return !bool;
                }
            }
        }
        return bool;
    }
    // (1)(g) new runSimulation method.
    public double runSimulation(int numAttendees)
    {
        BirthdaySimulation birthdaySimulation = new BirthdaySimulation();
        int count = 0;
        bdays = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            birthdaySimulation.createMeeting(numAttendees);
            final boolean b = birthdaySimulation.foundMatch();
            if (numAttendees>=2 && b) count++;
            bdays.clear();
        }
        double time = (count / 10000.0) * 100;
        return time;
    }


    public BirthdaySimulation() {
        this.bdays = new ArrayList<String>();
    }

    public static void main(String[] args) {
        BirthdaySimulation birthdaySimulation = new BirthdaySimulation();
//        birthdaySimulation.runSimulation(3);
        birthdaySimulation.createMeeting(5);
        System.out.println(birthdaySimulation.bdays);
//        int date = birthdaySimulation.ranDateInMonth("February");
//        System.out.println(birthdaySimulation.runSimulation(3));
//        System.out.println(birthdaySimulation.bdays);


    }


}

