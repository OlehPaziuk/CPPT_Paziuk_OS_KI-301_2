package KI301PaziukLab6;
import java.util.ArrayList;
public class Main<Safe extends Items> {

    private ArrayList<Safe> storage = new ArrayList();
// returns the item by the index
    public Safe get(int index)
    {
        return storage.get(index);
    }
// adds an item
    public void add(Safe item)
    {
        storage.add(item);
    }
// shows contents
    public void showAll()
    {
        for (Safe safe : storage) {
            try {
                safe.printData();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
// returns total mass
    public int getTotalMass()
    {
        int result = 0;
        for (Safe safe : storage) {
            result += safe.getWeight();
        }
        return result;
    }

     //Method that shows heaviest item

    public Safe  getLargestStore()
    {
        int largestIdx = 0;

        for(int i = 0; i < storage.size(); i++)
        {
            if(i == 0)
            {
                continue;
            }
            if(storage.get(i).getWeight() > storage.get(largestIdx).getWeight())
            {
                largestIdx = i;
            }
        }
        return storage.get(largestIdx);
    }
}
