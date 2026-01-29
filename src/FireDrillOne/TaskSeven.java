package FireDrillOne;

public class TaskSeven{
    public static void main(String[] args){
int countMultiple = 1;
int countMultipletwo = 1;
int countSum= 1;
    for(int count =1; count<=5; count++)
        for(int counter = 1;  counter<=10; counter++ )
 if (counter % 4 == 0 && counter ==4)
{
countMultiple *= counter;
countSum += countMultiple;
System.out.print(countSum + " ");
}
System.out.print(" ");
   for(int count =1; count<=5; count++)
        for(int counter = 1; counter<=10; counter++ )
if (counter % 4 == 0 && counter == 8){
countMultipletwo *= counter;
System.out.print(countMultipletwo + " ");
}
//int countSum = countMultipletwo + countMultiple;
System.out.print(countSum);
}
}   

