package nokia;

import java.util.Scanner;
public class Nokia{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
    String menu = """
           List of Menu functions
        1. Phone Book
        2. Messages
        3. Chat
        4. Call register
        5. Tones
        6. Settings
        7. Call divert
        8. Games
        9. Calculator
        10.Reminder
        11.Clock
        12.Profiles
        13.Sim services
                    """;
System.out.print(menu);
System.out.println("Enter an option: ");
int phonebook = input.nextInt();
switch(phonebook){
    case 1->  { 
System.out.println( """
        1. Search
        2. Service Nos
        3. Add name
        4. Erase
        5. Edit
        6. Assign Tone
        7. Send b'card
        8. Options
        9. Speed dials
        10.Voice tags
                  """ 
        );
        System.out.print("Enter an option: ");
        int options = input.nextInt();
            switch(options) {
            case 8 ->{
                    System.out.println("""
                    1.Type of view
                    2.Memory status
                    """);                   
                    }
            default ->System.out.println("Enter a valid option"); 
              }
        }
    case 2 -> 
{System.out.println("""
        1.Write messages
        2.Inbox
        3.Outbox
        4.Picture messages
        5.Templates
        6.Smileys
        7.Message settings
        8.Info service
        9.Voice service
        10.Service command editor
        """);
        System.out.print("Enter an option");
        int settings = input.nextInt();
            switch(settings) {
            case 7 ->{
                    System.out.println("""
                    1.Set 1
                    2.Common
                    """); 
 
            System.out.print("Enter an option: ");
            int set = input.nextInt();
                switch(set){
                case 1 ->{
                    System.out.println("""
                    1.Message center number
                    2.Message sent as
                    3.Message validity
                    """);
                    } 
                case 2 ->{
                    System.out.println("""
                    1.Delivery reports
                    2.Reply via same center
                    3.Character support
                    """);
}
                default->System.out.println("Enter a valid input");
                    } }                  
            default->System.out.println("Enter a valid option");
            }
}
    case 3 ->System.out.println("Chat");
    case 4 ->
{System.out.println("""
        1.Missed calls 
        2.Received calls
        3.Dialled numbers
        4.Erase recent call lists
        5.Show call duration
        6.Show call costs
        7.Call costs settings
        8.Prepaid credit
            """);
        System.out.println("Enter an option: ");
        int callDuration = input.nextInt();
            switch(callDuration){
            case 5 ->{
            System.out.println("""
            1.Last call duration
            2.All calls' duration
            3.Received calls' duration
            4.Dialled calls' duration
            5.Clear timers
            """);        
            }
            }
            switch(callDuration){
            case 6 ->{
            System.out.println("""
            1.Last call cost
            2.All calls' cost
            3.Clear counters
            """);
            }
            }  
            switch(callDuration){
            case 7 ->{
            System.out.println("""
            1.Call cost limit
            2.Show costs in
            """);
            }
            }
}
    case 5 ->
{System.out.println("""
            1.Ringing tone
            2.Ringing volume
            3.Incoming call alert
            4.Composer
            5.Messae alert tone
            6.Keypad tones
            7.Warning and game tones
            8.Vibrating alert
            9.Screen saver
            """);
}
    case 6 ->
{System.out.println("""
            1.Call Settings
            2.Phone settings
            3.Security settings
            4.Restore factory settings
            """);
            System.out.print("Enter an option: ");
            int settings = input.nextInt();
                switch(settings){
                case 1 ->{
                System.out.println("""
                1.Automatic redial
                2.Speed dialing
                3.Call waiting
                4.Own number sending
                5.Phone line in use
                6.Automatic answer 
                """);
                    }
                    }
                switch(settings){
                case 2 ->{
                System.out.println("""
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights2
                6. Confirm SIM service actions
                """);
                    }
                    }
                switch(settings){
                case 3 ->{
                System.out.println("""
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes  
                """);
                    }
                    }
}
    case 11 ->
{System.out.println("""
            1.Alarm clock
            2.Clock settings
            3.Date settings
            4.Stopwatch
            5.Countdown timer
            6.Auto update of date and time
            """);

}
}}
}
