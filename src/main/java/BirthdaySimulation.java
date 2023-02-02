
/**
 * Write a description of class BirthdaySimulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

public class BirthdaySimulation
{
    public ArrayList<String> bdays;

/**
 *  (1)(c) New 'ranMonth()' method.
 */
    public String ranMonth(){
        Random rand = new Random();
        int x = rand. nextInt(12);
        String month = "";
        switch (x){
            case 0: month = "January";
            break;
            case 1: month = "February";
            break;
            case 2: month = "March";
            break;
            case 3: month = "April";
            break;
            case 4: month = "May";
            break;
            case 5: month ="June" ;
            break;
            case 6: month = "July";
            break;
            case 7: month = "August";
            break;
            case 8: month = "September";
            break;
            case 9: month = "October";
            break;
            case 10: month ="November";
            break;
            case 11: month = "December";
            break;
        }
        return month;
    }

    public BirthdaySimulation(){
        this.bdays = new ArrayList<String>();
    }
}

