Try optimistic locking with Hibernate.

Entity setup and cases:

|                            | nothing | `version` attribute | `@DynamicUpdate` |
|----------------------------|---------|---------------------|------------------|
| change same attribute      | (QYWE)  | (QREZ)              | (Q7EN)           |
| change different attribute | (QHX6)  | (Q5NH)              | (QFR2)           |

Steps/Questions
-
1) Demonstrate cases in the table above. 

_id:VLCYNX
_title:Hibernate Optimistic locking