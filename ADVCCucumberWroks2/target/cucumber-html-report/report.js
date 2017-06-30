$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "login feature",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "duration": 180892,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@FirstDryRunTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "username and password is entered",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "designation"
      ],
      "line": 19
    },
    {
      "cells": [
        "subatra",
        "wel",
        "engineer1"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click on Submit",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Validate the User details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.browser_is_open()"
});
formatter.result({
  "duration": 91542641,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.username_and_password_is_entered(DataTable)"
});
formatter.result({
  "duration": 2600755,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_Submit()"
});
formatter.result({
  "duration": 50770,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_User_details()"
});
formatter.result({
  "duration": 46930,
  "status": "passed"
});
formatter.after({
  "duration": 278591,
  "status": "passed"
});
});