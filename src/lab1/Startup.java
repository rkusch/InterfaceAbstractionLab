/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 * I think that using an abstract class as a super class makes the most sense in this example. Some of the logic that applies to all sub-classes can be included in the super class.
 * @author kusch
 */
public class Startup {

    public static void main(String[] args) {

        Course adJava = new AdvancedJavaCourse("Advanced Java", "13232", "Intro to Java", 4);
        Course introJava = new IntroJavaCourse("Intro to Java", "13231", 4);
        Course introProgramming = new IntroToProgrammingCourse("Intro to Programming", "13230", 4);
    }

}
