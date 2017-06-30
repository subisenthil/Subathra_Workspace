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
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "username and password is entered",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "designation"
      ],
      "line": 7
    },
    {
      "cells": [
        "harry",
        "peter",
        "engineer1"
      ],
      "line": 8
    },
    {
      "cells": [
        "subi",
        "hello",
        "engineer2"
      ],
      "line": 9
    },
    {
      "cells": [
        "vinay",
        "segan",
        "child"
      ],
      "line": 10
    },
    {
      "cells": [
        "gijd",
        "okplpl",
        "dummy"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Click on Submit",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Validate the User details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.browser_is_open()"
});
formatter.result({
  "duration": 98442150,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.username_and_password_is_entered(DataTable)"
});
formatter.result({
  "duration": 5703657,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_Submit()"
});
formatter.result({
  "duration": 72527,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_User_details()"
});
formatter.result({
  "duration": 89167,
  "status": "passed"
});
});