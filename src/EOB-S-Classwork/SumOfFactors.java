package EOB;

public class SumOfFactors {



public static void main(String[]args){
System.out.print(countFactors(-76));
}
public static int countFactors(int number){

int sum = 0;

for (int factor = 2; factor <= number; factor++) {
while (number % factor == 0){
number /= factor;
sum +=factor;
if(number == 1){

}
}



}

return sum;
}


}

