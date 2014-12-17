/* 
 * File:   main.c
 * Author: jefftruong
 *
 * Created on December 17, 2014, 3:03 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
void pH() {
    printf("Ph level = ");
    float p;
    scanf("%f", &p);
    if ((p >= 6.5) && (p <= 7.5)) {
        printf("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
    } else if ((p < 0) || (p > 14)) {
        printf("pH is invalid");
    } else if (p <= 6.5) {
        printf("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
    } else if (p >= 7.5) {
        printf("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
    }
}

void closetwo() {

    float result = 0;
    long dem = 1;

    while (result < 2) {

        printf("%f + 1/%d = ", result, dem);
        result = result + (1.0 / dem);
        dem = dem * 2;
        printf("%f\n", result);
    }
}

void temperature() {
    int totalDays = 6;
    int day[totalDays];

    char* dayName[7];
        
    dayName[0] = "Monday";
    dayName[1] = "Tuesday";
    dayName[2] = "Wednesday";
    dayName[3] = "Thursday";
    dayName[4] = "Friday";
    dayName[5] = "Saturday";
    dayName[6] = "Sunday";

    int i;
    
    for (i=0; i <= totalDays; i++) {   
       printf("\non %s the temperature is: ", dayName[i]);
        scanf("%d" , &day[i]); 
        
    }
    for (i = 0; i <= totalDays; i++) {
       printf("The temperature on %s will be %d Degrees C\n" , dayName[i], day[i]);
    }
    
}

int main(int argc, char** argv) {




    temperature();

    return (EXIT_SUCCESS);
}
