Actually the same as VLCYNX, just upgrade of SpringBoot and use Maven now.

Try optimistic locking with Hibernate.
Use SpringBoot 4.
Use Maven.

Entity setup and cases:

|                            | nothing | `version` attribute | `@DynamicUpdate` |
|----------------------------|---------|---------------------|------------------|
| change same attribute      | (QYWE)  | (QREZ)              | (Q7EN)           |
| change different attribute | (QHX6)  | (Q5NH)              | (QFR2)           |

Steps/Questions
-
1) Demonstrate cases in the table above. 

_id:QEVCDB
_title:Hibernate Optimistic locking - SpringBoot 4