
public class Box {
//Properties(non static data->instance variables)
	private double width;
	private double depth;
	private double height;
	//add a parameterized construction to initialize COMPLETE state of the box
	Box(double w,double d,double height){
		width=w;
		depth=d;
		this.height=height;
	}
	//Behavior :functionality (method)
	//AQdd a method :to return Box detail in string form (dimension)
	String getBoxDims() {
		return "box dims are"+this.width+" "+this.depth+" "+this.height;
		//NOTE : the keyword here is optional
	}
	//Add method to return computed volume of BOX.
	double getComputedVolume() {
		return width*depth*this.height;
	}
}
