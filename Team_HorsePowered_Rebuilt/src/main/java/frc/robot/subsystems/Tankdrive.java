// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Tankdrive extends SubsystemBase {
  TalonFX rightFront, rightBack, leftFront, leftBack;

  /** Creates a new Tankdrive. */
  public Tankdrive() {
    rightBack = new TalonFX(0);
    rightFront = new TalonFX(1);
    leftBack = new TalonFX(2);
    leftFront = new TalonFX(3);
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
