package parsing_json;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class ElementCollection extends ArrayList{


    public ElementCollection getElementCollection() {
        return ElementCollectionInitializer.generate();
    }

    Element element = new Element();

    public Element findByAtomicNumber(int atomic_number) {
        ElementCollection elementCollection = new ElementCollection();
        for(int i = 0; i < elementCollection.size(); i++) {
            element = (Element)elementCollection.get(i);
            if (elementCollection.element.getNumber() == atomic_number);
            return element;
        }

        return null;
    }

    public Element findByName(String name) {

        return null;
    }

    public ElementCollection where(String fieldName, Object value) {

        return null;
    }
}
