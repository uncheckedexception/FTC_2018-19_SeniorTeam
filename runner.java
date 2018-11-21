package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name="runner")

public class runner extends OpMode{
    public static DeviceHandler foo = new DeviceHandler();
    public static drive bar = new drive();
    public void init(){

    }

    public void start(){
      foo.init(hardwareMap);
      bar.init(foo);
      bar.Forward(0.1, foo);
    }

    public void loop(){
      telemetry.addData("left:", foo.leftDrive.getDoubleCall());
      telemetry.addData("right:", foo.rightDrive.getDoubleCall());
      telemetry.update();
    }
}
