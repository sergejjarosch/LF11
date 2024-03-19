import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
    TelefonBuch telefonbuch_1 = new TelefonBuch();

    System.out.print("Gib hier die Telefonnummer ein: ");
    int keyToLookFor = new java.util.Scanner(System.in).nextInt();
    telefonbuch_1.search(keyToLookFor);

    }
}
class TelefonBuch{

    public String search(int key ){
        if(telefonBuch.containsKey(key))
            System.out.println(telefonBuch.get(key));
        return telefonBuch.get(key);
    }
    

    Map<Integer, String> telefonBuch = new java.util.HashMap<>() {{
        put(234567, "Manfred");
        put(123456, "Sabine");
        put(345678, "Klaus");
        put(456789, "Anna");
        put(567890, "Michael");
        put(678901, "Sandra");
        put(789012, "Peter");
        put(890123, "Monika");
        put(901234, "Thomas");
        put(112233, "Julia");
        put(223344, "Markus");
        put(334455, "Christine");
        put(445566, "Andreas");
        put(556677, "Susanne");
        put(667788, "Stefan");
        put(778899, "Jennifer");
        put(889900, "Martin");
        put(990011, "Laura");
        put(100100, "Jan");
        put(110011, "Nadine");
    }};
}
