public class QuestionNine{
public static int [] userInputToArray(int number){

     String card = number+"";
     int length = card.length();
     int [] cardArr = new int [length];
     for(int count= cardArr.length-1;count>=0;count--){
          cardArr[count]=number%10;
          number/=10;
}    
          return cardArr;
}
}
