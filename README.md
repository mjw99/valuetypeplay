# Experimental [JMH](http://openjdk.java.net/projects/code-tools/jmh/) for testing [Valhalla](http://jdk.java.net/valhalla/) Value types.
 

# QuickStart

## [Ubuntu Bionic](http://releases.ubuntu.com/bionic)

1. Obtain the valhalla JVM:
```bash
wget https://download.java.net/java/early_access/valhalla/20/openjdk-20-valhalla+20-75_linux-x64_bin.tar.gz
tar xf openjdk-20-valhalla+20-75_linux-x64_bin.tar.gz

cd jdk-20
export JAVA_HOME=`pwd`
export PATH=$JAVA_HOME/bin:$PATH
```

2. Compile and run the benchmark:

```bash
cd ~
git clone https://github.com/mjw99/valuetypeplay.git
cd valuetypeplay
mvn clean package && java -jar ./target/benchmarks.jar
```

3. Results:

```
https://github.com/openjdk/valhalla/commit/23045e59b2995352e667ba4bcabddcc38b91b3af
Ubuntu 18.04.3 LTS
AMD Ryzen 7 2700 Eight-Core Processor
microcode	: 0x800820d
Linux lags 4.15.0-72-generic #81-Ubuntu SMP Tue Nov 26 12:20:02 UTC 2019 x86_64 x86_64 x86_64 GNU/Linux

Benchmark                            Mode  Cnt  Score   Error  Units
InlineVector3DBenchmark.doBenchmark  avgt   10  2.593 ± 0.004  ns/op
Vector3DBenchmark.doBenchmark        avgt   10  3.218 ± 0.090  ns/op

```
