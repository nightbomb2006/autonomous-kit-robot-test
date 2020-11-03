/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  private final SpeedController frontLeft = new WPI_VictorSPX(Constants.FRONT_LEFT_CAN_ID);
  private final SpeedController frontRight = new WPI_VictorSPX(Constants.FRONT_RIGHT_CAN_ID);
  private final SpeedController rearLeft = new WPI_VictorSPX(Constants.REAR_LEFT_CAN_ID);
  private final SpeedController rearRight = new WPI_VictorSPX(Constants.REAR_RIGHT_CAN_ID);
  private final SpeedControllerGroup right = new SpeedControllerGroup(rearRight, frontRight);
  private final SpeedControllerGroup left = new SpeedControllerGroup(frontLeft, rearLeft);
    /**
   * Creates a new ExampleSubsystem.
   */
  public DriveSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
