package Commands;
import java.util.List;

import Device.ElectronicDevice;


public class TurnOffAllDevice
implements Command {

    List<ElectronicDevice> allDevice;

    public TurnOffAllDevice(List<ElectronicDevice> newDevice){
        allDevice = newDevice;
}

    @Override
    public void execute() {
        for (ElectronicDevice device : allDevice) device.off();
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : allDevice) device.on();
    }
}
