package org.internship.assignments;

public class OvertimeCalculator {

    public String overTime(double[] timeLog) {
        double regularEnd = 17.0; // 5pm

        double startTime = timeLog[0];
        double endTime = timeLog[1];
        double hourlyRate = timeLog[2];
        double multiplier = timeLog[3];

        double regularHours;
        double overtimeHours;

        // 1. Calculate Regular Hours (capped at 17:00)
        if (startTime < regularEnd) {
            // Regular hours are from start to min(end, 17)
            regularHours = Math.min(endTime, regularEnd) - startTime;
        } else {
            regularHours = 0;
        }

        // 2. Calculate Overtime Hours (anything after 17:00)
        if (endTime > regularEnd) {
            // Overtime starts at 17 or startTime (whichever is later)
            overtimeHours = endTime - Math.max(startTime, regularEnd);
        } else {
            overtimeHours = 0;
        }

        // 3. Calculate Pay
        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * (hourlyRate * multiplier);
        double totalEarnings = regularPay + overtimePay;

        // 4. Format to $ with 2 decimal places
        return String.format("$%.2f", totalEarnings);
    }
}