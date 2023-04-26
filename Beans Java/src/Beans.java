public class Beans implements java.io.Serializable {
    private String name;
    private int age;

    Beans(){
        name = "Sparsh";
        age = 19;
    }
     public String getName(){
        return name;
     }

     public void setName(String name){
        this.name = name;
     }
    public static void main(String[] args) {
        Beans b1 = new Beans();
        b1.setName("Madhur");
        System.out.println(b1.getName());
    }
}
