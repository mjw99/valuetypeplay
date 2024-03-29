package name.mjw.valuetypeplay;

public record Vector3D(double x, double y, double z) {

	public double getNorm() {
		return Math.sqrt(x * x + y * y + z * z);
	}

}
