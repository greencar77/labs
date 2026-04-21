Try Java modules.

Use Java 9+.

Steps/Questions
=
1) Create two Maven modules one depending on another and one using a module from the first one. Let the primary module have classes Alpha and Beta each put in own package. Let the Alpha package be exported.
2) What happens if beta is imported into secondary module (Q24W)?
3) What happens if `module-info.java` is moved to some lower folder, not the root?
4) What happens in the client module if `module-info.java` is empty for the primary module (QUTC)? 

Resources:
* [Baeldung - JA Guide to Java Modularity](https://www.baeldung.com/java-modularity)

_id:7ZYDYX
_title:Java Modules