package parsing_json;

import java.util.ArrayList;


public class ElementCollection extends ArrayList{

    private ElementCollection elementCollection;


    private ElementCollection getElementCollection() {
        elementCollection = ElementCollectionInitializer.generate();
        return this.elementCollection;
    }

    Element element = new Element();

    public Element findByAtomicNumber(int atomic_number) {
        getElementCollection();

        element = (Element)elementCollection.get(atomic_number-1);


        return element;
    }

    public Element findByName(String name) {
        getElementCollection();
        for(Object e: elementCollection){
            if (element.getName() != null && element.getName().contains(name));
            return (Element)e;
        }
        return null;
    }

    public ElementCollection where(String fieldName, Object value) {

        return null;
    }
}
