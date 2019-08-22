package name.mjw.valuetypeplay;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;
import static org.openjdk.jmh.annotations.Scope.Thread;

import java.util.concurrent.ThreadLocalRandom;

@State(Thread)
@OutputTimeUnit(SECONDS)
@BenchmarkMode(AverageTime)
@Fork(value = 1)
@Warmup(iterations = 5)
@Measurement(iterations = 10)

public class All {

	int count = 50_000_000;

	Vector3D[] vectors = new Vector3D[count];

	@Setup
	public void setup() {

		for (int i = 0; i < count; i++) {

			vectors[i] = new Vector3D(ThreadLocalRandom.current().nextDouble(),
					ThreadLocalRandom.current().nextDouble(), ThreadLocalRandom.current().nextDouble());
		}

	}

	@Benchmark
	@CompilerControl(CompilerControl.Mode.DONT_INLINE)
	public void doBenchmark() {

		for (int i = 0; i < count; i++) {

			vectors[i].getNorm();
		}

	}

}
