package KI301PaziukLab6;
public class Items {
    private int weight;
    private String material;
    private String name;
    private String brand;

    public Items(int weight, String material, String name, String brand)
    {
        this.name = name;
        this.material = material;
        this.brand = brand;
        this.weight = weight;
    }
    // method shows the data
    public void printData()
    {
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
    }
    public int getWeight() {return weight;}
    public String getName() {return name;}
    public String getBrand() {return brand;}
    public String getMaterial() {return material;}
}
