$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("apack/myfirsttest.feature");
formatter.feature({
  "id": "google-search",
  "description": "\r\nIn order to seacrh with Google\r\nAs a User\r\nI want to be able to search by clicking the search button",
  "name": "Google search",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "google-search;i-want-to-play-with-google",
  "tags": [
    {
      "name": "@tester",
      "line": 8
    }
  ],
  "description": "",
  "name": "I want to play with Google",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Google site",
  "keyword": "Given ",
  "line": 11
});
formatter.step({
  "name": "I enter a my name",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "click on Search button",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I am redirected to the search page",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "Mygoogleteststeps.IaminGooglesite()"
});
formatter.result({
  "duration": 11188625115,
  "status": "passed"
});
formatter.match({
  "location": "Mygoogleteststeps.entername()"
});
formatter.result({
  "duration": 3277883314,
  "status": "passed"
});
formatter.match({
  "location": "Mygoogleteststeps.clickbutton()"
});
formatter.result({
  "duration": 4171654089,
  "status": "passed"
});
formatter.match({
  "location": "Mygoogleteststeps.redirectiontopage()"
});
formatter.result({
  "duration": 51136199,
  "status": "passed"
});
});