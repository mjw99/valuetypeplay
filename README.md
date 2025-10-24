# Experimental [JMH](http://openjdk.java.net/projects/code-tools/jmh/) for testing [Valhalla](http://jdk.java.net/valhalla/) Value types.
 

# QuickStart

## [Ubuntu Jammy](http://releases.ubuntu.com/jammy)

1. Obtain the valhalla JVM:
```bash
wget https://download.java.net/java/early_access/valhalla/26/1/openjdk-26-jep401ea2+1-1_linux-x64_bin.tar.gz
tar xf openjdk-26-jep401ea2+1-1_linux-x64_bin.tar.gz

cd jdk-26
export JAVA_HOME=`pwd`
export PATH=$JAVA_HOME/bin:$PATH
```

2. Compile and run the benchmark:

```bash
cd ~
git clone https://github.com/mjw99/valuetypeplay.git
cd valuetypeplay
mvn clean package && java -jar  --enable-preview ./target/benchmarks.jar
```

3. Results:

```
openjdk-26-jep401ea2+1-1_linux-x64_bin.tar.gz
Ubuntu 24.04.3 LTS
AMD Ryzen 7 2700 Eight-Core Processor
microcode   :0x800820e
Linux lags 6.8.0-86-generic #87-Ubuntu SMP PREEMPT_DYNAMIC Mon Sep 22 18:03:36 UTC 2025 x86_64 x86_64 x86_64 GNU/Linux

Benchmark                           Mode  Cnt  Score   Error  Units
ValueVector3DBenchmark.doBenchmark  avgt   10  3.358 ± 0.277  ns/op
Vector3DBenchmark.doBenchmark       avgt   10  3.378 ± 0.097  ns/op
```
