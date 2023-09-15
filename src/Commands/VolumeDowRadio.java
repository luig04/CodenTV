package Commands;

import Device.ElectronicDevice;

public class VolumeDowRadio implements Command {

    private ElectronicDevice device;

    public VolumeDowRadio(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
}
}