/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.AutoDriveSubsystem;

/**
 * An example command that uses an example subsystem.
 */
public class AutoDriveCommand extends CommandBase {
  private final AutoDriveSubsystem mAutoDrive;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public AutoDriveCommand(AutoDriveSubsystem driveSubsystem mForwardSpeed mRotationSpeed) {
   
   mAutoDrive = driveSubsystem; 
   mForwardSpeed = forwardSpeed;
   mRotationSpeed = rotationSpeed;
     
    addRequirements(mAutoDrive);
  
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mAutoDrive.drive(-mForwardSpeed.getX(), mRotationSpeed.getZ());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
