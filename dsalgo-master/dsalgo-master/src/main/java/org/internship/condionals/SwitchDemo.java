package org.condionals.internship;

public class SwitchDemo {

    public String getDayType(int dayNumber) {
        String type;

        // The switch checks the value of dayNumber
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                type = "Weekday";
                break; // 'break' stops it from falling into the next case
            case 6:
            case 7:
                type = "Weekend";
                break;
            default:
                type = "Invalid Day"; // Runs if no cases match
                break;
        }
        return type;
    }
}