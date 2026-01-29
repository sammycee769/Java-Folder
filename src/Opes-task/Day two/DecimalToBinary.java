package Opes;

public class DecimalToBinary{
public static void main(String...args){
System.out.print(toBinary(100));
//toBinary(5);
}

public static String toBinary(int decimal){
if(decimal<0){
decimal = decimal * -1;
}
if(decimal==0){
return "0";
}
int division;
int multiple;
String remainder="";
String numb = "";

while(decimal != 0){
    division = decimal%2;
    multiple = decimal / 2;
    decimal = multiple;
//    System.out.print(division);

    numb+= division + "";
}

for(int count=numb.length()-1; count>=0;count--){
remainder+=numb.charAt(count);
}

return remainder;
}
}
