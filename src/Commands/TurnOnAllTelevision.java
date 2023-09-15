package Commands;
import Device.ElectronicDevice;


public class TurnOnAllTelevision implements Command {
    private ElectronicDevice device;

    public void TurnOnAllDevice(ElectronicDevice device){
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