package FireDrillOne;

public class TaskSix{
    public static void main(String[] args){
int countMultiple = 1;
int countMultipletwo = 1;
    for(int count =1; count<=5; count++)
        for(int counter = 1;  counter<=10; counter++ )
 if (counter % 4 == 0 && counter ==4)
{
countMultiple *= counter;
System.out.print(countMultiple + " ");
}
System.out.print(" ");
   for(int count =1; count<=5; count++)
        for(int counter = 1; counter<=10; counter++ )
if (counter % 4 == 0 && counter == 8){
countMultipletwo *= counter;
System.out.print(countMultipletwo + " ");
}
}
}   

