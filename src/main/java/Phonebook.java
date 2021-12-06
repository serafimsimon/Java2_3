import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> elements = new HashMap<>();

    @Override
    public String toString() {
        return "Телефонный справочник:" +
                " " + elements +
                ' ';
    }

    public void add(String name, String number) {

        ArrayList<String> phones = elements.get(name);
        if (phones != null) {
            phones.add(number);
        } else {
            phones = new ArrayList<>();
        phones.add(number);
        elements.put(name, phones);}
    }

    public String[] get(String name) {
        return elements.get(name).toArray(new String[elements.size()]);
    }
}
