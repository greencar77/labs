Try out different cases of @Nullable etc annotations in JSpecify.

Questions
=
1) Is alert given if @Nullable getter is called within ternary operator, like `alpha.getAddress() == null? "Nothing" : alpha.getAddress().length()`? (Q6VS)
2) Is alert given if the @NonNullable object is checked with ternary operator? (Q3B5)

Resources
=
* [Baeldung - A Practical Guide to Null-Safety in Java With JSpecify](https://www.baeldung.com/java-jspecify-null-safety)

_id:AE1KAD
_title:JSpecify nullability
_tag:javaapi