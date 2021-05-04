// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//Alisha Paul

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(0.6, 13, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new TurnDegrees(-0.35, 85, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
// pick up ball 1
        new DriveDistance(0.7, 8.5, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new TurnDegrees(-0.35, 25, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new DriveDistance(-0.4, 2, drivetrain),
        new DriveDistance(-0.7, 25, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new TurnDegrees(0.35, 85, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new DriveDistance(0.4, 2, drivetrain),
        new DriveDistance(0.7, 8, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new TurnDegrees(-0.35, 85, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
 // pick up ball 2
        new DriveDistance(0.4, 2, drivetrain),
        new DriveDistance(0.7, 24, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new DriveDistance(-0.4, 2, drivetrain),
        new DriveDistance(-0.7, 24, drivetrain),
        new TurnDegrees(0.35, 75, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new DriveDistance(0.4, 2, drivetrain),
        new DriveDistance(0.7, 20, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new TurnDegrees(-0.35, 85, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
// pick up ball 3
        new DriveDistance(0.4, 2, drivetrain),
        new DriveDistance(0.7, 23, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new DriveDistance(-0.4, 13, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new TurnDegrees(-0.35, 90, drivetrain),
        new DriveTime(0, 0.1, drivetrain),
        new DriveDistance(-0.5, 12, drivetrain)
        );
  }
}