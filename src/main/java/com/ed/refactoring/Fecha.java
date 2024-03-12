/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ed.refactoring;

/**
 * 
 * @author DAW
 */
public class Fecha {

    private int day;

    private int month;

    private int year;

    /**
     * Write a date
     * @param day 
     * @param month
     * @param year 
     */
    public Fecha(int day, int month, int year) {

        this.setDay(day) ;

        this.setMonth(month);

        this.setYear(year);

    }
    
    public boolean validMonth(){
        
        return getMonth() > 1 && getMonth() < 12;
    }         
    
    //Created to a month cant have more that than it has        
    public boolean dayMonth()  {

        int diasMes = 0;

        switch (getMonth()) {
            case 1:
                diasMes = 31;
                break;

            case 2: // verificación de año bisiesto
                if ((getYear() % 400 == 0) || ((getYear() % 4 == 0) && (getYear() % 100 != 0))) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
                
            case 3:
                diasMes = 31;
                break;
                
            case 4:
                diasMes = 30;
                break;
                
            case 5:
                diasMes = 31;
                break;

            case 6:
                diasMes = 30;
                break;

            case 7:
                diasMes = 31;
                break;

            case 8:
                diasMes = 31;
                break;
                
            case 9:
                diasMes = 30;
                break;

            case 10:
                diasMes = 31;
                break;
                
            case 11:
                diasMes = 30;
                break;

            case 12:
                diasMes = 31;
                break;
        }

        if (getDay() > diasMes) {
            return false;
        } else {
            return true;
        }
        
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
}
