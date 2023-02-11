
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
        int min = 1;
        int max31 = 31;
        int max30 = 30;
        int max29 = 29;
        int max28 = 28;
        Random rand = new Random();
        int zeroToThree = rand.nextInt(4);
        int oneToThirtyOne = rand.nextInt(max31 - min + 1) + min;
        int oneToThirty = rand.nextInt(max30 - min + 1) + min;
        int oneToTwentyNine = rand.nextInt(max29 - min + 1) + min;
        int oneToTwentyEight = rand.nextInt(max28 - min + 1) + min;
        int number = rand.nextInt();
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
/*
    ArrayList method contains is 'ignoreCase' by default.
 */
        if (months.contains(aMonth)) {
            switch (aMonth) {
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                    number = oneToThirtyOne;
                    break;
                case "April":
                case "June":
                case "September":
                case "November":
                    number = oneToThirty;
                    break;
                case "February":
                    if (zeroToThree == 0) {
                        return number = oneToTwentyNine;
                    } else {
                        return number = oneToTwentyEight;
                    }
            }
            System.out.println("Date: " + number);
            return number;

        }else{
            System.out.println(aMonth + " is not a Month");
            try{
                number = Integer.valueOf(aMonth);
                System.out.println(number);
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }
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
                if(i==j) continue;
                boolean match = bdays.get(i).equals(bdays.get(j));
                if (match) return  !bool;
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
        System.out.println(count);
        System.out.println(time);
        return time;
    }


    public BirthdaySimulation() {
        this.bdays = new ArrayList<String>();
    }

    public static void main(String[] args) {
        BirthdaySimulation birthdaySimulation = new BirthdaySimulation();
//        birthdaySimulation.runSimulation(3);
//       birthdaySimulation.createMeeting(5);
        System.out.println(birthdaySimulation.bdays);
        int date = birthdaySimulation.ranDateInMonth("februAry");
        System.out.println(birthdaySimulation.runSimulation(5));
//       System.out.println(birthdaySimulation.bdays);


    }


}

