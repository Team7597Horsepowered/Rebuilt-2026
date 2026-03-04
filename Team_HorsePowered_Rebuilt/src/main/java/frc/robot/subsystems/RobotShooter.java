// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RobotShooter extends SubsystemBase {
  /** Creates a new Robotshooter. */
  SparkMax Shooters;
  SparkMax Rollers;
  public RobotShooter() {
    Shooters = new SparkMax(5, MotorType.kBrushed);
    Rollers = new SparkMax(6, MotorType.kBrushed);

  }

  //TODO: there is something missing
  public void shoot(double speed) {
    Shooters.set(speed);
  }

  //TODO: add parameters and logic
  public void intake(){

  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
