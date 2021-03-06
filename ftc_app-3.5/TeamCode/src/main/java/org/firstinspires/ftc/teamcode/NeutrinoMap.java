package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Josh on 12/12/17.
 */

/**
 * The purpose of the NeutrinoMap class is to work together with a Robot class to add easy implementation across op-modes and auto.
 * Holds named concurrent to that of the robot controller.
 */
public class NeutrinoMap {

    //Motors
    DcMotor leftFrontDrive;
    DcMotor leftBackDrive;
    DcMotor rightFrontDrive;
    DcMotor rightBackDrive;
    DcMotor leftTake;
    DcMotor rightTake;

    //IMU
    BNO055IMU gyro;

    /**
     * Map class used for easy implementation of custom motor classes and BB18 robot class
     */
    public NeutrinoMap() {
        //Empty on purpose
    }

    /**
     * Initializes custom map class with passed through hardwareMap from op-mode class
     * @param hardwareMap hardware map from op-mode class
     */
    public void init(HardwareMap hardwareMap) {
        // Motors
        leftFrontDrive = hardwareMap.get(DcMotor.class, "leftF");
        leftBackDrive = hardwareMap.get(DcMotor.class, "leftB");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "rightF");
        rightBackDrive = hardwareMap.get(DcMotor.class, "rightB");
        gyro = hardwareMap.get(BNO055IMU.class, "gyro"); //IMU


        leftTake = hardwareMap.get(DcMotor.class, "leftT");
        rightTake = hardwareMap.get(DcMotor.class, "rightT");
    }

}
