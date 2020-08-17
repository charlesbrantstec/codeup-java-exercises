import java.util.Random;


public class ServerNameGenerator {

    public static void main(String[] args){
        String[] adjectives = {"good", "awesome", "extravagant", "epic", "great", "cool", "awesome", "superb","pogchamp"};
        String[] nouns = {"squirrel", "lizard", "armadillo", "butterfly", "toad", "frog", "dragonfly", "walking-stick", "ant", "chipmunk"};
        System.out.println(randomAdjective());
    }


    Random random = new Random();

    public void randomAdjective(String[] adjectives){
        int index = random.nextInt(adjectives.length);
        System.out.println(adjectives[index]);
    }

}
