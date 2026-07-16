Try different approaches how to peek into H2 database which is used by your Java application.

Take [h2access.zip](h2access.zip) as a project basis.

Steps/Questions
-
1) Try a case when h2 database is stored into file and some tool like DBeaver is used to access it (`spring.datasource.url=jdbc:h2:file:~/testdb`) (QOPJ)
2) Access memory H2 using H2 bean (QYQP)
3) Can H2 web console be used? (QBQW)
4) Try to run a query in DBeaver while the unit test is working but without commit. What happens when the threshold of the batch is reached? (QTBE)

_id:JURSPC
_title:H2 db access
