package KI301PaziukLab6;
public class App {
    public static void main(String[] args)
    {
        Main<? super Items> safe = new Main();

        safe.add(new Ring(30, "Gold", "WeddingRing", "UkrZoloto"));
        safe.add(new Watch(250, "Silver", "AcerWatch", "Acer"));

        safe.showAll();
        System.out.println(safe.get(0).getName());
        System.out.println(safe.getTotalMass());
        System.out.println(safe.getLargestStore().getName());
    }
}
