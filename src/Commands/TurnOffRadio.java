package Commands;

import Device.ElectronicDevice;


public class TurnOffRadio implements Command {
    private ElectronicDevice device;

    public TurnOffRadio(ElectronicDevice device){
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
