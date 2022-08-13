package Stack.Exercise2;

public class Car {
    // creating instance variable
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // creating  method for model
    public void setModel1(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("Carrera") || validModel.equals("holden")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }

    }
    public String getModel(){
        return this.model;
    }




}
