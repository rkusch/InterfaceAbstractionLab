/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 * I think that using an interface class as a super class creates more work for
 * the programmer. My reasoning for this is that each sub-class must contain
 * common properties and methods and these should be placed in the super-class.
 *
 * @author kusch
 */
public class Startup {

    public static void main(String[] args) {

        Course adJava = new AdvancedJavaCourse("Advanced Java", "13232", "Intro to Java", 4);
        Course introJava = new IntroJavaCourse("Intro to Java", "13231", 4);
        Course introProgramming = new IntroToProgrammingCourse("Intro to Programming", "13230", 4);
    }

}
