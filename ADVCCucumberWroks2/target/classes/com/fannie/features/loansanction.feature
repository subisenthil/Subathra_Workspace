@Sanity
Feature:
  To sanction loan for working people
Background:
Given documents and submitted
Scenario Outline:
# Given When Then And But
 Given the customer works "<workTime>" time
  And  working in "<officeType>" office
  # this for showing you database
  When  credit score is more than "<cs>"
  Then Sanction loan
  But customer has to repay with in "<repayYear>" years
  
Examples:
  | workTime | officeType | cs  | repayYear | 
  | full     | govt       | 500 |  20       |
  | full     | private    | 567 |  17       |
  | part     | govt       | 900 |  14       |

  


