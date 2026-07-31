Try `@Transactional`.

Steps/Questions
-
1) Try annotation on the class and method 
2) What if `merge()` is called without transaction? (QCD0) 
3) Can `find()` work without transaction? If yes, is the object managed then?
4) Try `@Transactional(readOnly = true)` with `merge()` (QF7I)

_id:WRLA8Z
_title:@Transactional