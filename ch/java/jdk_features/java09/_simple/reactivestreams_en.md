Try Reactive Streams.

Use Java 9+.

Questions
=
1) Add a couple of processors which consumes generated integer numbers each in a slightly different way.
2) What will happen if some processor consumes numbers at a slower pace than they are generated?
3) What happens if a processor is subscribed twice to the same publisher?
4) What will happen if there is no `this.subscription.request(1);` call in `onSubscribe()` or `next()`?

Resources:
* [JEP 266](https://openjdk.org/jeps/266)
* [Baeldung - Java Reactive Streams](https://www.baeldung.com/java-9-reactive-streams)

_id:6KUYRS
_title:Java Reactive Streams API