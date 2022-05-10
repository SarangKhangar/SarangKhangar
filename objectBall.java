public class objectBall{
        String material;
        String colour;
        double price;
    
    public objectBall(String material, String colour, double price){
        this.material = material;
        this.colour = colour;
        this.price = price;
        }
    /*public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }*/
   /* @Override
    public String toString() {
        return "objectBall [colour=" + colour + ", material=" + material + ", price=" + price + "]";
    }*/
public static void main(String[] args){
    objectBall obj = new objectBall("red", "leathr", 100);
    objectBall obj1 = new objectBall("yellow", "plastic", 200);
    System.out.println(obj);
    System.out.println(obj1);

}}
    

    

