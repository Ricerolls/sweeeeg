
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jefftruong
 */
public class BMI {

    /**
 * Name:    Steven Le
 * Date:    Sept 24, 2013
 * Version: v0.1
 * Description: This program will calculate the users total weight and height in
 *              either using the metric or imperial formula to state the weight
 *              class of its user.
 * @author 1leste
 */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objects
        Scanner input = new Scanner(System.in);

        //varibles

        double weight;
        double height;
        int decision;
        double result = -1;



        System.out.println("Body mass index (BMI) is a measure of the weight of a person scaled according to their height.");
        System.out.println("BMI is defined as the individual's body weight divided by the square of their height.");     
        System.out.println("It is almost always expressed in the unit kg/m2.");
        System.out.println("To find out your BMI, type in 1 for metric or 2 for imperial: ");
        decision = input.nextInt();

        if (decision != 1 && decision != 2) {
            System.out.println("Invalid, please enter 1 or 2");
        
       
            
        } else if (decision == 1) {
            System.out.println("Please enter your weight: ");
            weight = input.nextDouble();
            System.out.println("Please enter your height: ");
            height = input.nextDouble();
            result = (weight / (height * height));

        } else if (decision == 2) {
            System.out.println("Please enter your weight: ");
            weight = input.nextDouble();
            System.out.println("Please enter your height: ");
            height = input.nextDouble();
            result = ((weight * 703) / (height * height));

        }

        if (result < 15) {
            System.out.println("Starvation");
        } else if (result < 18.5) {
            System.out.println("Underweight");
        } else if (result < 25) {
            System.out.println("Ideal");
        } else if (result < 30) {
            System.out.println("Overweight");
        } else if (result < 40) {
            System.out.println("Obese");
        } else {
            System.out.println("Morbidly Obese");
        }
    }
}

