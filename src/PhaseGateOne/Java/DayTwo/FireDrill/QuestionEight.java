package PhaseGateOne.Java.DayTwo.FireDrill;

public class QuestionEight {
public static int add(int [] number) {
int counter = 0;
for(int count=number.length-1;count >= 0;count++){
counter+=number[count];
}
return counter;
}
}

