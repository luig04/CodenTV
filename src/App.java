import java.util.ArrayList;
import java.util.List;

import Commands.TurnOffAllDevice;
import Commands.TurnOffAllTelevision;
import Commands.TurnOffRadio;
import Commands.TurnOffTelevision;
import Commands.VolumeUpTelevision;
import Device.Television;
import Device.ElectronicDevice;
import Device.Radio;
import Commands.TurnOnAllTelevision;
import Commands.TurnOnRadio;
import Commands.TurnOnTelevision;
import Commands.VolumeDowRadio;
import Commands.VolumeDownTelevision;
import Commands.VolumeUpRadio;

public class App {
    public static void main(String[] args) throws Exception{

    ElectronicDevice televisionOne = new Television("kalley");

    TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

    DeviceButton onPressed;
    onPressed = new DeviceButton(onCommand);
    onPressed.press();


    TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
    onPressed = new DeviceButton(offCommand);
    onPressed.press();

    VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
    onPressed = new DeviceButton(volUpCommand);
    onPressed.press();
    onPressed.press();
    onPressed.press();

    VolumeDownTelevision volDowCommand = new VolumeDownTelevision (televisionOne);
    onPressed =
    new DeviceButton(volDowCommand);
    onPressed.press();

//----------------------------------------------------

    ElectronicDevice radioOne = new Radio("LG");
    TurnOnRadio onCommand1 = new TurnOnRadio(radioOne);

    DeviceButton onPressed1;
    onPressed1 = new DeviceButton(onCommand1);
    onPressed1.press();


    TurnOffRadio offCommand1 = new TurnOffRadio(radioOne);
    onPressed1 = new DeviceButton(offCommand1);
    onPressed1.press();

    VolumeUpRadio volUpCommand1 = new VolumeUpRadio(radioOne);
    onPressed1 = new DeviceButton(volUpCommand1);
    onPressed1.press();
    onPressed1.press();
    onPressed1.press();

    VolumeDowRadio volDowCommand1 = new VolumeDowRadio (radioOne);
    onPressed1 =
    new DeviceButton(volDowCommand1);
    onPressed1.press();

List<ElectronicDevice> allDevices = new ArrayList<>();
    allDevices.add(televisionOne);
    allDevices.add(radioOne);

    TurnOffAllDevice turnOffAllDevice = new TurnOffAllDevice(allDevices);
    DeviceButton turnThemOff = new DeviceButton(turnOffAllDevice);

    turnThemOff.press();
    turnThemOff.pressUndo();

    }
}









