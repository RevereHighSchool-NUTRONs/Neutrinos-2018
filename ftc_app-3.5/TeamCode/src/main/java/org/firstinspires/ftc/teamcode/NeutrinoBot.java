package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.BBLibrary.Hardware.BBGyro;
import org.firstinspires.ftc.teamcode.BBLibrary.Hardware.BBMotor;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;

/**
 * Created by Josh on 12/12/17.
 */

public class NeutrinoBot {

    //Declaring drivetrain motors and objects
    public BBMotor leftFrontDrive;
    public BBMotor leftBackDrive;
    public BBMotor rightFrontDrive;
    public BBMotor rightBackDrive;
    public Drivetrain NeutrinoDrive;

    //Declaring intake motors and object
    public BBMotor leftTake;
    public BBMotor rightTake;
    public Intake NeutrinoTake;

    //IMU
    public BBGyro gyro;

    NeutrinoMap robotMap;

    /**
     * NeutrinoBot Robot class
     * @param hardwareMap hardwareMap from op-mode class
     */
    public NeutrinoBot(HardwareMap hardwareMap) {

        robotMap = new NeutrinoMap(); //Declaring map class
        robotMap.init(hardwareMap); //Receiving passed through map class for creating custom hardware

        //Assigning Drivetrain Motors and Object
        leftFrontDrive = new BBMotor(robotMap.leftFrontDrive, BBMotor.MotorType.RevHDHex);
        leftBackDrive = new BBMotor(robotMap.leftBackDrive, BBMotor.MotorType.RevHDHex);
        rightFrontDrive = new BBMotor(robotMap.rightFrontDrive, BBMotor.MotorType.RevHDHex);
        rightBackDrive = new BBMotor(robotMap.rightBackDrive, BBMotor.MotorType.RevHDHex);
        gyro = new BBGyro(robotMap.gyro); // Assigning IMU
        NeutrinoDrive = new Drivetrain(leftFrontDrive, leftBackDrive, rightFrontDrive, rightBackDrive, gyro);


        //Assigning Intake Motors and Object
        leftTake = new BBMotor(robotMap.leftTake, BBMotor.MotorType.NeveRest);
        rightTake = new BBMotor(robotMap.rightTake, BBMotor.MotorType.NeveRest);
        NeutrinoTake = new Intake(leftTake, rightTake);


    }
}
