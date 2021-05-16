package name.mjw.valuetypeplay;

public primitive class InlineVector3D {

	private final double x;
	private final double y;
	private final double z;

	InlineVector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getNorm() {
		return Math.sqrt(x * x + y * y + z * z);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

}
