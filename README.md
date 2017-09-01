This is a simple test case showing how to package Tika into a far jar in a usable manner.

In particular, take note of the sbt-assembly settings.

To compile:
	sbt assembly

To use:
	java -jar target/scala-2.12/tikafonts-assembly-0.1-SNAPSHOT.jar calibri.pdf
