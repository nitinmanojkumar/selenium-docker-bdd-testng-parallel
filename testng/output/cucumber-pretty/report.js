$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/search.feature");
formatter.feature({
  "line": 2,
  "name": "Duck Duck Go Search",
  "description": "",
  "id": "duck-duck-go-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"\u003ckeyword\u003e\" to search",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;",
  "rows": [
    {
      "cells": [
        "keyword"
      ],
      "line": 11,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;1"
    },
    {
      "cells": [
        "java"
      ],
      "line": 12,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;2"
    },
    {
      "cells": [
        "webdriver"
      ],
      "line": 13,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;3"
    },
    {
      "cells": [
        "docker"
      ],
      "line": 14,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;4"
    },
    {
      "cells": [
        "kubernetes"
      ],
      "line": 15,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 952400,
  "status": "passed"
});
formatter.before({
  "duration": 6267346800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"java\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 1456101000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 2029641100,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 608243400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 843394700,
  "status": "passed"
});
formatter.after({
  "duration": 627800,
  "status": "passed"
});
formatter.after({
  "duration": 165737500,
  "status": "passed"
});
formatter.before({
  "duration": 205000,
  "status": "passed"
});
formatter.before({
  "duration": 3257355400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"webdriver\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 783640200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "webdriver",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 1861782800,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 490296500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 341535800,
  "status": "passed"
});
formatter.after({
  "duration": 158400,
  "status": "passed"
});
formatter.after({
  "duration": 215199000,
  "status": "passed"
});
formatter.before({
  "duration": 207800,
  "status": "passed"
});
formatter.before({
  "duration": 5191314100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"docker\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 920746200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "docker",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 2338565600,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 406722200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 645014400,
  "status": "passed"
});
formatter.after({
  "duration": 236900,
  "status": "passed"
});
formatter.after({
  "duration": 146538000,
  "status": "passed"
});
formatter.before({
  "duration": 115400,
  "status": "passed"
});
formatter.before({
  "duration": 5545185600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"kubernetes\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 782416700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kubernetes",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 2200722800,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 696113000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 437425700,
  "status": "passed"
});
formatter.after({
  "duration": 113400,
  "status": "passed"
});
formatter.after({
  "duration": 97994600,
  "status": "passed"
});
});