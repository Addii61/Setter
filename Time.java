/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtime;

/**
 *
 * @author cui
 */
public class Time {
    private double hours;
    private double minutes;
    public void sethours(double h){
    this.hours=h;}
    public void setminutes(double t){
    this.minutes=t;}
    public double sethours(){
    return this.hours;}
    public double setminutes(){
    return this.minutes;}
    public void displaytime(){
      System.out.printf("time is %f hour %f minutes\n",this.hours,this.minutes);}
     public void displayminutes(){
         
         System.out.printf("\nTime in minutes is:%f",this.minutes+this.hours*60);
     }
        
    
}
