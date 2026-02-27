// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Tankdrive extends SubsystemBase {
  TalonFX rightFront, rightBack, leftFront, leftBack;

  /** Creates a new Tankdrive. */
  public Tankdrive() {
    rightBack = new TalonFX(Constants.DriveConstants.rightBackID);
    rightFront = new TalonFX(Constants.DriveConstants.rightFrontID);
    leftBack = new TalonFX(Constants.DriveConstants.leftBackID);
    leftFront = new TalonFX(Constants.DriveConstants.leftFrontID);
  }

  public void setSpeed(double speed){
    rightBack.set(speed);
    rightFront.set(speed);
    leftBack.set(-speed);
    leftFront.set(-speed);
  }

  public void spin(double speed){
    rightBack.set(speed);
    rightFront.set(speed);
    leftBack.set(speed);
    leftFront.set(speed);
  }

  public void setRightSpeed(double speed){
    rightBack.set(speed);
    rightFront.set(speed);
  }

  public void setLeftSpeed(double speed){
    leftBack.set(speed);
    leftFront.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
