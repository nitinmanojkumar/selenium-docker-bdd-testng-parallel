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
  "duration": 875400,
  "status": "passed"
});
formatter.before({
  "duration": 6283115200,
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
  "duration": 1453893100,
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
  "duration": 2035549800,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 594214100,
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
  "duration": 887915900,
  "status": "passed"
});
formatter.after({
  "duration": 152400,
  "status": "passed"
});
formatter.after({
  "duration": 572474400,
  "status": "passed"
});
formatter.before({
  "duration": 130900,
  "status": "passed"
});
formatter.before({
  "duration": 2774240500,
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
  "duration": 767085700,
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
  "duration": 1939337500,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 523117300,
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
  "duration": 257612700,
  "status": "passed"
});
formatter.after({
  "duration": 120300,
  "status": "passed"
});
formatter.after({
  "duration": 192884900,
  "status": "passed"
});
formatter.before({
  "duration": 257700,
  "status": "passed"
});
formatter.before({
  "duration": 5362345500,
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
  "duration": 857702900,
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
  "duration": 2183533500,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 392276100,
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
  "duration": 758413000,
  "status": "passed"
});
formatter.after({
  "duration": 108400,
  "status": "passed"
});
formatter.after({
  "duration": 175275900,
  "status": "passed"
});
formatter.before({
  "duration": 149800,
  "status": "passed"
});
formatter.before({
  "duration": 5330843800,
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
  "duration": 719699000,
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
  "duration": 1985681900,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 292339700,
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
  "duration": 638495000,
  "status": "passed"
});
formatter.after({
  "duration": 130100,
  "status": "passed"
});
formatter.after({
  "duration": 159391200,
  "status": "passed"
});
});