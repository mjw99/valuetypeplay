# Experimental [JMH](http://openjdk.java.net/projects/code-tools/jmh/) for testing [Valhalla](http://jdk.java.net/valhalla/) Value types.
 

# QuickStart

## [Ubuntu Focal](http://releases.ubuntu.com/focal)

1. Obtain the valhalla JVM:
```bash
wget https://download.java.net/java/early_access/valhalla/1/openjdk-23-valhalla+1-90_linux-x64_bin.tar.gz
tar xf openjdk-23-valhalla+1-90_linux-x64_bin.tar.gz

cd jdk-23
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
openjdk-23-valhalla+1-90_linux-x64_bin.tar.gz
Ubuntu 20.04.5 LTS
AMD Ryzen 7 2700 Eight-Core Processor
microcode	: 0x800820d
Linux lags 6.8.0-40-generic #40~22.04.3-Ubuntu SMP PREEMPT_DYNAMIC Tue Jul 30 17:30:19 UTC 2 x86_64 x86_64 x86_64 GNU/Linux

Benchmark                           Mode  Cnt  Score   Error  Units
ValueVector3DBenchmark.doBenchmark  avgt   10  2.820 ± 0.009  ns/op
Vector3DBenchmark.doBenchmark       avgt   10  2.860 ± 0.068  ns/op
```
