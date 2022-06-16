public class LinkedList {
    public static void main(String[] args) {

        String Country1 = "Germany,capital:Berlin";
        String Country2 = "France,capital:Paris";
        String Country3 = "Great Britain,capital:London";
        String Country4 = "Spain,capital:Madrid";

        java.util.LinkedList<String> stateList = new java.util.LinkedList<>();

        stateList.add(Country1);
        stateList.add(Country2);
        stateList.add(Country3);
        stateList.add(Country4);
        System.out.println(stateList);
        System.out.println(stateList.get(2));
        stateList.add(1, "Portugal, capital:Lissabon");
        for (String s : stateList) {
            System.out.println(s);
        }
        stateList.remove(1);
        System.out.println(stateList);
        stateList.set(1, "Russia, capital:Moscow");
        System.out.println(stateList);
    }

}






