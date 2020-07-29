$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/test/testCases/VerifyLoginFunctionality.feature");
formatter.feature({
  "name": "Verify the Login Functionality",
  "description": "  I want to check whether user can login to application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login with valid user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userLogin"
    }
  ]
});
formatter.step({
  "name": "User navigates to the application",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin@phptravels.com",
        "demoadmin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with valid user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@userLogin"
    }
  ]
});
formatter.step({
  "name": "User navigates to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginToApplication.user_navigates_to_the_application()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat util.Utility.openApplication(Utility.java:13)\r\n\tat stepDefinitions.LoginToApplication.user_navigates_to_the_application(LoginToApplication.java:11)\r\n\tat ✽.User navigates to the application(src/test/java/test/testCases/VerifyLoginFunctionality.feature:8)\r\n",
  "status": "failed"
});
});