
public class Rotation extends Matrix22 {
	double alpha;
	Rotation(double alpha) {
		super(Math.sin(alpha), Math.cos(alpha),
				-Math.cos(alpha), Math.sin(alpha));
		
		this.alpha = alpha;
	}
	
	double getAngle() {
		return alpha;		
	}
	

}
