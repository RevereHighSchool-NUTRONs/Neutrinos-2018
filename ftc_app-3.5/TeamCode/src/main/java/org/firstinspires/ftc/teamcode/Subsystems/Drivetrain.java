package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.BBLibrary.Hardware.BBGyro;
import org.firstinspires.ftc.teamcode.BBLibrary.Hardware.BBMotor;

/**
 * Created by Brian Estevez on 11/21/2017. Edited by Josh for Neutrinos FTC team.
 */

public class Drivetrain {
    public BBMotor leftFrontDrive;
    public BBMotor leftBackDrive;
    public BBMotor rightFrontDrive;
    public BBMotor rightBackDrive;

    public Drivetrain(BBMotor leftFrontDrive, BBMotor leftBackDrive, BBMotor rightBackDrive, BBMotor rightFrontDrive, BBGyro gyro) {
        this.rightFrontDrive = rightFrontDrive;
        this.rightBackDrive = rightBackDrive;
        this.leftFrontDrive = leftFrontDrive;
        this.leftBackDrive = leftBackDrive;
    }

    public void drive(float gamepad1LeftY, float gamepad1LeftX, float gamepad1RightX ) {
        float lfPow = gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
        float lbPow = gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
        float rfPow = -gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
        float rbPow = -gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
        rfPow = Range.clip(rfPow, -1, 1);
        lfPow = Range.clip(lfPow, -1, 1);
        lbPow = Range.clip(lbPow, -1, 1);
        rbPow = Range.clip(rbPow, -1, 1);

        leftFrontDrive.setPower(lfPow);
        leftBackDrive.setPower(lbPow);
        rightFrontDrive.setPower(rfPow);
        rightBackDrive.setPower(rbPow);
    }

}



