# Experimental [JMH](http://openjdk.java.net/projects/code-tools/jmh/) for testing [Valhalla](http://jdk.java.net/valhalla/) Value types.
 

# QuickStart

## [Ubuntu Bionic](http://releases.ubuntu.com/bionic)

1. Obtain the valhalla JVM:
```
wget https://download.java.net/java/early_access/valhalla/4/openjdk-14-valhalla+4-55_linux-x64_bin.tar.gz
tar xfz openjdk-14-valhalla+4-55_linux-x64_bin.tar.gz

cd jdk-14
export JAVA_HOME=`pwd`
export PATH=$JAVA_HOME/bin:$PATH
```

2. Compile and run the benchmark:

```
cd ~
git clone https://github.com/mjw99/valuetypeplay.git
cd valuetypeplay
mvn clean package && java -jar ./target/benchmarks.jar
```

3. Results:

```
117779bd
Ubuntu 18.04.3 LTS
AMD Ryzen 7 2700 Eight-Core Processor
microcode	: 0x800820d
Linux lags 4.15.0-62-generic #69-Ubuntu SMP Wed Sep 4 20:55:53 UTC 2019 x86_64 x86_64 x86_64 GNU/Linux

Benchmark                            Mode  Cnt  Score   Error  Units
InlineVector3DBenchmark.doBenchmark  avgt   10  2.614 ± 0.073  ns/op
Vector3DBenchmark.doBenchmark        avgt   10  4.120 ± 0.041  ns/op
```
