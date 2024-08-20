package IOVeriAkislari.ObjectStream;

import java.io.Serializable;

public class Car implements Serializable {

    private String brand;
    private String model;

    public Car(String name, String model){
        this.brand = name;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model= model;
    }
}
