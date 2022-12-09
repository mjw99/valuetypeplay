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
openjdk-20-valhalla+20-75_linux-x64_bin.tar.gz
Ubuntu 20.04.5 LTS
AMD Ryzen 7 2700 Eight-Core Processor
microcode	: 0x800820d
Linux lags 5.15.0-56-generic #62~20.04.1-Ubuntu SMP Tue Nov 22 21:24:20 UTC 2022 x86_64 x86_64 x86_64 GNU/Linux


ValueVector3DBenchmark.doBenchmark  avgt   10  2.868 ± 0.007  ns/op
Vector3DBenchmark.doBenchmark       avgt   10  2.903 ± 0.118  ns/op

```
