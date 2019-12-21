/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;


/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  
  private VictorSPX motorLeft1 = new VictorSPX(RobotMap.MOTOR_LEFT_1_ID);
  private TalonSRX motorLeft2 = new TalonSRX(RobotMap.MOTOR_LEFT_2_ID);
  private VictorSPX motorLeft3 = new VictorSPX(RobotMap.MOTOR_LEFT_3_ID);
  private VictorSPX motorRight1 = new VictorSPX(RobotMap.MOTOR_RIGHT_1_ID);
  private TalonSRX motorRight2 = new TalonSRX(RobotMap.MOTOR_RIGHT_2_ID);
  private VictorSPX motorRight3 = new VictorSPX(RobotMap.MOTOR_RIGHT_3_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.''

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed) {
    motorLeft1.set(ControlMode.PercentOutput, speed);
    motorLeft2.set(ControlMode.PercentOutput, speed);
    motorLeft3.set(ControlMode.PercentOutput, speed);

  }

  public void setRightMotors(double speed) {
    motorRight1.set(ControlMode.PercentOutput, -speed);
    motorRight2.set(ControlMode.PercentOutput, -speed);
    motorRight3.set(ControlMode.PercentOutput, -speed);

  }
}
