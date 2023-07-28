
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;

public class Dictionary {

    //Initialization of variables
    public static Hashtable<String, String> dict = new Hashtable<String, String>();//Initializatoin of hashtable
    public static ArrayList<String> stores = new ArrayList(); //Initialization of arraylist that stores search history
    public static ArrayList<String> indexlist = new ArrayList() ;//Initialization of arraylist that stores hashtable keys
    public static String[] indexarray = new String[indexlist.size()];//Initialization of array that stores hashtable keys
    public static String[] grouparray = {"Ejiga Alexander BHU/20/04/05/0046","Mivanyi BHU/20/04/05/0044","Samuel GOJI GABI BHU/20/04/05/0142","Ikemka Romanus BHU/20/04/05/0016","Clement Idaminabo BHU/20/04/05/0054"};//Initialization of array that holds list of members

    //Using .put method to add key-value pairs to hashtable
    static {
        dict.put("apples", " Apple trees need at least six to eight hours of sunlight . Best soil for apple trees is moist with a neutral soil pH of 6.0 to 7.0.");
        dict.put("bananas", " Banana plants need full sun and do best when planted in rich, well-draining soil. Most varieties prefer slightly acidic soil ");
        dict.put("beans", "Beans need a warm climate ,well-drained fine sandy loam soil with a slightly acidic pH 5 to 7.5.");
        dict.put("broccoli", "Plant Broccoli during the cool weather. Space plants 12 inches apart in fertile, soil with a pH of 6.5 to 7.0.");
        dict.put("cabbage", "Plant cabbage during the cool weather. Space plants 12 inches apart in fertile, soil with a pH of 6.5 to 7.0.");
        dict.put("cactus", " cacti thrive in full sun and fast-draining soil");
        dict.put("carrots", " Carrots grow best in cool temperatures of early spring and late fall");
        dict.put("cassava", " Cassava require a fertile, well-drained soil with a high organic matter content.They typically take about 14 weeks to mature");
        dict.put("cauliflower", "Plant cauliflower during the cool weather. Space plants 12 inches apart in fertile, soil with a pH of 6.5 to 7.0.");
        dict.put("coconuts", " Coconut palms tolerate wind, heat, salt spray,drought, but are moisture-loving plants that grow in sandy and loamy soils.");
        dict.put("chickens", "Chickens need protection from extreme weather space, fresh air, hygiene, access to feed and water, and accommodation.");
        dict.put("cotton", " Cotton needs lot of heat and plentysunshine. It has a small germination rate, if the soil temperature is below 60°F (15°C).");
        dict.put("cows", "Cows need protection from extreme weather space, fresh air, hygiene, access to feed and water, and accommodation.");
        dict.put("crayfish"," clean water, oxygen, food, light and room to swim, temperature range is 82° to 86° F");
        dict.put("cucumber", "Cucumbers grow best at high temperatures, at around 85°F,they must be supplied with moisture and plant nutrients.");
        dict.put("eggplant", "Eggplant needs 6 to 8 hours of sunlight. Eggplant grows best sandy loam or loam soil fairly high in organic matter.");
        dict.put("garden-egg", "garden-egg needs 6 to 8 hours of sunlight. It grows best sandy loam or loam soil fairly high in organic matter.");
        dict.put("garlic", " Garlic grows best in well-drained, moisture-retentive soil with pH between 6.0 and 7.0. ");
        dict.put("goats", "Goats need protection from extreme weather space, fresh air, hygiene, access to feed and water, and accommodation.");
        dict.put("green-beans", "greenbeans require proper sunlight and good drainage, and they grow best when the soil pH ranges between 6.0 and 6.2");
        dict.put("green-peas", "green-peas require proper sunlight and good drainage, and they grow best when the soil pH ranges between 6.0 and 6.2");
        dict.put("groundnut", "needs hot weather. Soil needs to be fertile and neutral pH of 6.5 to 7.0. mix aged manure and/or compost into the soil.");
        dict.put("lettuce", "Lettuce grow best at high temperatures, around 85°F,they must be supplied with moisture and plant nutrients.");
        dict.put("mackerel", "clean water, oxygen, food, light and room to swim, temperature range is 82° to 86° F");
        dict.put("maize", " Corn does best with warm, sunny growing weather (75–86° F), well-distributed intermittent moderate rains, or irrigation ");
        dict.put("mangoes", "Mango trees need full sun and do best when planted in rich, well-draining soil. Most varieties prefer slightly acidic soil ");
        dict.put("mr.barka", " 6-figure salary in $");
        dict.put("mushrooms", "Mushrooms thrive in damp, dark conditions. They require a medium that is high in decaying plant matter");
        dict.put("okra", " Okra needs hot weather. Soil needs to be fertile and neutral pH of 6.5 to 7.0. mix aged manure and/or compost into the soil.");
        dict.put("onions", "onions requires abundant sun and good drainage, and they grow best when the soil pH ranges between 6.0 and 6.8.");
        dict.put("oranges", "Orange trees need full sun and do best when planted in rich, well-draining soil. Most varieties prefer slightly acidic soil ");
        dict.put("peaches", "Peach trees need full sun and do best when planted in rich, well-draining soil. Most varieties prefer slightly acidic soil ");
        dict.put("peppers", " Intense sunlight and good drainage");
        dict.put("pigs", "Pigs need protection from extreme weather space, fresh air, hygiene, access to feed and water, and accommodation.");
        dict.put("potatoes", "Potatoes need a warm climate ,well-drained fine sandy loam soil with a slightly acidic pH 5 to 7.5. ");
        dict.put("pumpkins", "Plant pumpkin during the cool weather. Space plants 12 inches apart in fertile, soil with a pH of 6.5 to 7.0.");
        dict.put("radish", "Radishes need a warm climate ,well-drained fine sandy loam soil with a slightly acidic pH 5 to 7.5. ");
        dict.put("rice", " Temperature =27°C ,  labour = not intensive , soil = clayey-loam soil");
        dict.put("sardines", "clean water, oxygen, food, light and room to swim, temperature range is 82° to 86° F");
        dict.put("spinach", "Plant spinach during the cool weather. Space spinach plants 12 inches apart in fertile, soil with a pH of 6.5 to 7.0.");
        dict.put("stockfish", " clean water, oxygen, food, light and room to swim, temperature range is 82° to 86° F");
        dict.put("sweet-potatoes", "Sweet potatoes need a warm climate ,well-drained fine sandy loam soil with a slightly acidic pH 5 to 7.5. ");
        dict.put("tilapia", "clean water, oxygen, food, light and room to swim, temperature range is 82° to 86° F");
        dict.put("tomato", "Tomato plants grow well in full sun for most of the day. The soil pH should be slightly acidic (6.2 to 6.8).");
        dict.put("tuna", "clean water, oxygen, food, light and room to swim, temperature range is 82° to 86° F");
        dict.put("watermelons", "Watermelon need heat, and a growing season of at least 70 to 85 days=. Temperatures range between 70 and 80F.");
        dict.put("yams", "Yams require a fertile, well-drained soil with a high organic matter content.Yams typically take about 14 weeks to mature");

        //set the keys into the arraylist
        for (String key : dict.keySet()) {
            indexlist.add(key);
        }
        //sort the keys in the arraylist
        Collections.sort(indexlist);
        //set the arraylist as an array
        indexarray = indexlist.toArray(new String[0]);

    }
}
