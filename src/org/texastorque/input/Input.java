package org.texastorque.input;

public abstract class Input {
	
//	TODO: begin all DriveBase variables with prefix 'DB'
	
	protected double DB_SpeedLeft;
	protected double DB_SpeedRight;
	protected double DB_Setpoint;
	
	public double getDB_Setpoint() {
		return DB_Setpoint;
	}
	
	public double getDB_SpeedLeft() {
		return DB_SpeedLeft;
	}
	
	public double getDB_SpeedRight() {
		return DB_SpeedRight;
	}
	
}
