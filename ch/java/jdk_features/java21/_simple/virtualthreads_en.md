Try virtual threads.

Steps/Questions
-
1) Create virtual threads by `Executors.newVirtualThreadPerTaskExecutor()` (QJLI)
2) Create virtual threads by `Executors.newFixedThreadPool` + `ThreadFactory` (QF2Z)

Resources
-
* [Oracle Help Center - Virtual Threads](https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html#GUID-DC4306FC-D6C1-4BCC-AECE-48C32C1A8DAA)
* [JEP 444](https://openjdk.org/jeps/444)
* [Baeldung - Difference Between Thread and Virtual Thread in Java](https://www.baeldung.com/java-virtual-thread-vs-thread)

_id:
_title:Java virtual threads (Java 21)