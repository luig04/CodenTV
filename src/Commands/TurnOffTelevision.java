package Commands;
import  Device.ElectronicDevice;

public class TurnOffTelevision implements Command{

    private ElectronicDevice device;
    public TurnOffTelevision(ElectronicDevice device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.on();
    }
    @Override
    public void undo() {
        device.off();
    }

}