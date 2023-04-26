package utils;

import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
		public static final int MIN_SPEED;
		public static final int MAX_SPEED;
		
		static {
			MIN_SPEED=30;
			MAX_SPEED=80;
		}
		
		//Static method for evaluating the speed of the vehicle
		public static void validateSpeed(int speed) throws SpeedOutOfRangeException{
			if(speed<MIN_SPEED)
				throw new SpeedOutOfRangeException("Driving too slow. Speed up!");
			else if(speed>MAX_SPEED)
				throw new SpeedOutOfRangeException("Driving too fast. Slow down!");
			else
				System.out.println("Speed is within range");
		}
			
}
