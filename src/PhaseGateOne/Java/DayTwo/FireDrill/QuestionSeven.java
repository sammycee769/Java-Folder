package PhaseGateOne.Java.DayTwo.FireDrill;

public class QuestionSeven {
public static int smallest(int [] number) {
int smallest = number[0];
    for(int count = number.length-1; count >= 0; count++){
if( smallest < number[count])
smallest =  number[count];
}
return smallest;
}
}

