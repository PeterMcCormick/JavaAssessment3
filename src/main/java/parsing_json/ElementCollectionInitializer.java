package parsing_json;

import com.google.gson.Gson;

import java.io.*;
import java.util.Arrays;

public class ElementCollectionInitializer {

    public static ElementCollection generate()  {
        ElementCollection elementCollection = new ElementCollection();
        Element[] element;
        try {
            BufferedReader br = new BufferedReader((new FileReader("/Users/petermccormick/Dev/Peter/Assessment3/JavaAssessment3/src/main/resources/periodic_table.json")));
            Gson gson = new Gson();
            element = gson.fromJson(br, Element[].class);
            elementCollection.addAll(Arrays.asList(element));

            return elementCollection;
        } catch (IOException e) {
            elementCollection = null;
            return elementCollection;
        }
    }

//    ElementCollection<Element> elementCollection = new ElementCollection<Element>();
//        String rawData = "";
//        Gson gson = new Gson();
//        Type ElementCollectionType = new TypeToken<ArrayList<Element>>(){}.getType();
//        List<Element> elementList = new Gson().fromJson("periodic_table.json".replace("[", "{").replace("]", "}"), ElementCollectionType);
    //elementCollection = new Gson().fromJson("periodic_table.json", Element.class)
    //System.out.println(elementCollection);
//        JsonParser parser = new JsonParser();
//        JsonArray array = parser.parse("periodic_table.json").getAsJsonArray();
//        String message = gson.fromJson(array.get(0), String.class);
//        int number = gson.fromJson(array.get(1), int.class);
//        elementCollection = gson.fromJson(array.get(2), ElementCollection.class);

//        elementCollection = gson.fromJson("periodic_table.json", ElementCollection.class);
//            BufferedReader br = new BufferedReader(new FileReader("periodic_table.json"));

//            //elementCollection.add(gson.fromJson(reader, Element.class));

//            Element collectionType = new TypeToken<ElementCollection<Element>>(){}.getType();
//            ElementCollection<Element> enums = gson.fromJson("periodic_table.json", collectionType);

    //ArrayList elementCollection = new ElementCollection();

    //elementCollection.add(element);
//    return elementCollection;
}
