package name.mjw.valuetypeplay;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;
import static org.openjdk.jmh.annotations.Scope.Thread;

import java.util.concurrent.ThreadLocalRandom;

@State(Thread)
@OutputTimeUnit(NANOSECONDS)
@BenchmarkMode(AverageTime)
@Fork(value = 1)
@Warmup(iterations = 5)
@Measurement(iterations = 10)

public class Vector3DBenchmark {

	final int count = 10_000_000;

	double[] result;

	Vector3D[] vectors;

	@Setup
	public void setup() {
		result = new double[count];
		vectors = new Vector3D[count];

		for (int i = 0; i < count; i++) {

			vectors[i] = new Vector3D(ThreadLocalRandom.current().nextDouble(),
					ThreadLocalRandom.current().nextDouble(), ThreadLocalRandom.current().nextDouble());
		}

	}

	@Benchmark
	@OperationsPerInvocation(count)
	public void doBenchmark() {

		for (int i = 0; i < count; i++) {

			result[i] = vectors[i].getNorm();
		}

	}

}
