import java.util.*;

public class Factory {
    public Map<String, LinkedList<String>> wichMap(String l){
        switch (l){
            case "1":
                return new HashMap<>();
            case "2":
                return new TreeMap<>();
            case "3":
                return new LinkedHashMap<>();
        }
        return null;
    }
}
