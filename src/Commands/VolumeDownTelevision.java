package Commands;

import Device.ElectronicDevice;

public class VolumeDownTelevision implements Command {

    private ElectronicDevice device;

    public VolumeDownTelevision(ElectronicDevice device) {
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

