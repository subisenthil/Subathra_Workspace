@SmokeTest
Feature:
	login feature
Scenario:
  Given Browser is open
  When username and password is entered
  | username | password |designation|
  | harry    | peter    |engineer1  |
  | subi     | hello    |engineer2  |
  | vinay    | segan    |child      |
  | gijd     | okplpl   |dummy      |
  When Click on Submit
  Then Validate the User details
  
  @FirstDryRunTest
  Scenario:
  Given Browser is open
  When username and password is entered
  | username | password |designation|
  | subatra  | wel      |engineer1  |
 
  When Click on Submit
  Then Validate the User details

