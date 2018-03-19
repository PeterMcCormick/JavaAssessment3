package parsing_json;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ElementCollectionInitializer {

    public static ElementCollection generate() throws IOException {
        ElementCollection<Element> elementCollection = new ElementCollection<Element>();

        try (Reader reader = new InputStreamReader(ElementCollectionInitializer.class.getResourceAsStream
                ("periodic_table.json"), "UTF-8")) {
            Gson gson = new GsonBuilder().create();
            elementCollection.add(gson.fromJson(reader, Element.class));
            System.out.println(elementCollection.toString());
        }
        catch (IOException e)  {

        }

        //ArrayList elementCollection = new ElementCollection();

        //elementCollection.add(element);
        return elementCollection;
    }
}
