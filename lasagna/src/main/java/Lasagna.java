public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int actualmin){
        return 40 - actualmin;    
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layer){
        return layer*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int no_layers,int no_minutes){
        return (no_layers*2) + no_minutes;
    }
}
