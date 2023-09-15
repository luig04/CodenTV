package Commands;
import Device.ElectronicDevice;


public class TurnOffAllTelevision implements Command {
    private ElectronicDevice device;

    public void TurnOffAllDevice(ElectronicDevice device){
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
