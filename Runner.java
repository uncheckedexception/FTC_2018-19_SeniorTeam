package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.*;

@Autonomous(name="Depot")

public class Runner extends LinearOpMode{
    public static TensorFlow yan = new TensorFlow();
    public static DeviceHandler foo = new DeviceHandler();
    public static Drive bar = new Drive();

    @Override
    public void runOpMode(){
      foo.init(hardwareMap, 0);
      //yan.init(hardwareMap);
      waitForStart();
      //foo.moveMotor(6, 1);
      //sleep(4900);//14000
      //foo.moveMotor(6, 0);

      bar.back(9,foo);
      bar.turn(60,foo);
      //bar.back(-45,foo);
      bar.forward(125, foo);
      foo.setServoPosition(2,1);
      bar.turn(-25,foo);
      bar.back(150,foo);
      telemetry.addData("Left Motor Position", foo.getMotorPosition(0));
      telemetry.addData("Right Motor Position", foo.getMotorPosition(1));
      telemetry.update();

      //foo.moveMotor(0, 1);
      //sleep(1000);
      //foo.moveMotor(0,0);
      //foo.moveMotor(6, 1);
      //sleep(14000);
      //foo.moveMotor(6, 0);
      //bar.turn(90, foo);
      /*
      int gold = -1;
      while(gold == -1){
        gold = yan.findGold();
        telemetry.addData("Location:", gold);
        telemetry.update();
      }
      yan.shutdown();
      */
      /*
      bar.turn(10, foo);
      bar.forward((gold - 1) * 39, foo);
      bar.turn(-90, foo);
      bar.forward(10, foo);
      bar.turn(90, foo);
      bar.forward(-(gold - 1) * 39, foo);
      bar.turn(-90, foo);
      */
      //blah blah blah
      /*
      bar.turn(70,foo);
      bar.forward(85,foo);
      bar.turn(-80,foo);
      bar.forward(139,foo);
      bar.forward(-150,foo);
      */
      //while(true){

      //}
    }
}
