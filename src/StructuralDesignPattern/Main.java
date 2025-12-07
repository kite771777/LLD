package StructuralDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started...");
//https://www.plantuml.com/plantuml/uml/ZPBFIiGm4CRlynJ3NbIa-m15PEDUt9lWHRqDxMY3tIHCua7KTvSiGqXZ5O_b-zDlVcGN4qbwEyu0yTMwG497dAtZz1uOlQJ90rYNM9vfO3o4oJlUJoGlBFW1Y8YNE9o-xx9qVW5VTS2uKRmTrnCgLi5XfXXHtG-FJqtWDwUvsV-psemK4ijoJwSXwPkzV_vSOPGEMxFfLLqhEYdQT8Q7-ywWy4p9UXSd6o8iALzzRhSraXutERDPipNd5QkUrLOgk-BBUsxDpq5DRTTTDw1oGmwMLTbJ4BGMsB4Ryvlx1W00
//        IphoneCharger charger=new ChargerXYZ();
//        Iphone iphone=new Iphone(charger);
//        iphone.chargeIphone();
        IphoneCharger charger=new AdapterCharger(new ChargerABC());
        Iphone iphone=new Iphone(charger);
        iphone.chargeIphone();

    }
}
