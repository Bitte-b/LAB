

import java.awt.*;

public class Scania extends Car {

    public double platformAngle;


    public Scania (int nDoors, double enginePower, Color color, String modelName ){
        super(nDoors, enginePower, color,modelName);
        this.stopEngine();

    }

    public Scania(){
        this(2, 540, Color.green, "Scania" );
        this.stopEngine();
        platformAngle = 0;
    }

    void ChangePlatform(Scania s){

    }
    public double speedFactor(){
        return getEnginePower() * 0.01;
    }
}
