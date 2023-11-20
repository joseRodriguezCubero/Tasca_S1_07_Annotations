package n2exercici1;


import java.io.Serial;
import java.io.Serializable;

public class CarSerializable implements Serializable {
    @JsonSerializable(directory = "src/main/java/n2exercici1")
    private String brand;
    private String model;

        @Serial
        private static final long serialVersionUID=1L;

        private transient String idPlate; //no queremos serializar la matricula


        public String getIdPlate() {
            return idPlate;
        }

        public void setIdPlate(String idPlate) {
            this.idPlate = idPlate;
        }


        public CarSerializable(String brand, String model, String idPlate) {
            this.brand = brand;
            this.model = model;
            this.idPlate = idPlate;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "CarSerializable{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", idPlate='" + idPlate + '\'' +
                    '}';
        }
    }
