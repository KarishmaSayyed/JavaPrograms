public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            return (temperature >= 25) && (temperature <= 45);
        }
        else {
            return (temperature >= 25) && (temperature <= 35);
        }
    }
}
 /* ORIGINAL CODE
 public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if((temperature >=25) && (temperature <= 45)){
                return true;
            } return false;
        }
        else {
            if((temperature >=25) && (temperature <= 35)){
                return true;
            }
        }
        return false;
    }
}

  */