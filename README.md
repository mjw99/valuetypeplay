# Experimental [JMH](http://openjdk.java.net/projects/code-tools/jmh/) for testing [Valhalla](http://jdk.java.net/valhalla/) Value types.
 

# QuickStart

## [Ubuntu Bionic](http://releases.ubuntu.com/bionic)

1. Obtain the valhalla JVM:
```
wget https://download.java.net/java/early_access/valhalla/3/openjdk-14-valhalla+3-48_linux-x64_bin.tar.gz
tar xfz openjdk-14-valhalla+3-48_linux-x64_bin.tar.gz

cd jdk-14
export JAVA_HOME=`pwd`
export PATH=$JAVA_HOME/bin:$PATH
```

2. Compile and run the benchmark:

```
cd ~
git clone https://github.com/mjw99/valuetypeplay.git
cd valueTypePlay
mvn clean package && java -jar ./target/benchmarks.jar
```

