public class QuestionSix {
public static int largest(int [] number) {
int largest = number[0];
for(int count=number.length-1;count >= 0;count++){
if( largest > number[count])
largest =  number[count];
}
return largest;
}
}

