/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;
/**
Author: SAASHWIN RAAJ A/L PRAPU
ID Number: S86485
Course: CSF3034 Programming 
Description: To demonstrate a simple Java Program
Date: 28 OCTOBER 2026
Modified Date: None
Version: 1.0
**/
public class StudentInformationSystem {
    public static void main(String[] args) {
        String name = "SAASHWIN RAAJ A/L PRAPU";
        String studID = "S86485";
        int mark1 = 49;
        int mark2 = 0;
        int total = mark1 + mark2;
        
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studID);
        System.out.println("Total Mark: " + total);
        System.out.println("Semester: Semester 1");
        
        if (total >= 80){
            System.out.println("Result: Excellent");
        }
        else if (total <= 40){
            System.out.println("Result: Poor");
        }
        else{
            System.out.println("Result: Needs Improvement");
        }
    }
}
