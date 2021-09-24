package adapter_pattern;

/**
 * @author totoro
 * @date 2021-09-23 11:33
 */
public class PoliceCarAdapter extends CarController{

    private PoliceSound sound;
    private PoliceLamp lamp;

    public PoliceCarAdapter(){
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        sound.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
