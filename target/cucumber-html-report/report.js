$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature using input data from excel",
  "description": "This feature is responsible for testing all the scenarios related to application authentication",
  "id": "login-feature-using-input-data-from-excel",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7181412784,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Check Login functionality with correct username and password",
  "description": "",
  "id": "login-feature-using-input-data-from-excel;check-login-functionality-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Customer open binup-jewelry application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he clicks sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enters UserName and Password provided in excel",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "he clicks login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "he should see welcome greeting after successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iOpenApplication()"
});
formatter.result({
  "duration": 4412195830,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_see_and_click_sign_in_link()"
});
formatter.result({
  "duration": 205907189,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_UserName_and_Password()"
});
formatter.result({
  "duration": 6072231672,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 71842,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_welcome_greeting()"
});
formatter.result({
  "duration": 27719350,
  "status": "passed"
});
formatter.after({
  "duration": 164665426,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search a product using DataTable",
  "description": "Verifying if the search functionality works",
  "id": "search-a-product-using-datatable",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Customer searches for a ring",
  "description": "",
  "id": "search-a-product-using-datatable;customer-searches-for-a-ring",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Customer is in binup-jewelry application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following product name in the search box and click search",
  "rows": [
    {
      "cells": [
        "ProductCode",
        "ProductName"
      ],
      "line": 7
    },
    {
      "cells": [
        "BIN72034",
        "PANDORA Silver Pink Enamel Rose Ring 190905EN40"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see search result number",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I am able to click the product DETAILS buttton",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.customerIsLoggedIntoBinupJewelryApplication()"
});
formatter.result({
  "duration": 1222258840,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_enter_the_following_product_name_in_the_search_box_and_click_search(DataTable)"
});
formatter.result({
  "duration": 349703420,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_see_search_result_number()"
});
formatter.result({
  "duration": 1178204944,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_am_able_to_click_the_product_DETAILS_buttton()"
});
formatter.result({
  "duration": 137986087,
  "status": "passed"
});
formatter.after({
  "duration": 130055438,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Customer searches for two rings and add both of them to a cart",
  "description": "",
  "id": "search-a-product-using-datatable;customer-searches-for-two-rings-and-add-both-of-them-to-a-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Customer is in binup-jewelry application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I search the following products and add them to a cart",
  "rows": [
    {
      "cells": [
        "ProductCode",
        "ProductName"
      ],
      "line": 15
    },
    {
      "cells": [
        "BIN72034",
        "PANDORA Silver Pink Enamel Rose Ring 190905EN40"
      ],
      "line": 16
    },
    {
      "cells": [
        "BIN9210",
        "Hot Diamonds Just Add Love Silver Earrings DE110"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I see added item number in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.customerIsLoggedIntoBinupJewelryApplication()"
});
formatter.result({
  "duration": 4349868773,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iSearchTheFollowingProductsAndAddThemToACart(DataTable)"
});
formatter.result({
  "duration": 11705865281,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iSeeAddedItemNumberInTheCart()"
});
formatter.result({
  "duration": 1788695477,
  "status": "passed"
});
formatter.after({
  "duration": 408745094,
  "status": "passed"
});
formatter.uri("UnsuccessfulLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Invalid Login Feature using Scenario Outline and Examples keyword",
  "description": "Description: This feature is responsible for testing all the scenarios related to application authentication",
  "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Login functionality with invalid credentials using Examples",
  "description": "",
  "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword;verify-login-functionality-with-invalid-credentials-using-examples",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens binup-jewelry application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "invalid account message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword;verify-login-functionality-with-invalid-credentials-using-examples;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword;verify-login-functionality-with-invalid-credentials-using-examples;;1"
    },
    {
      "cells": [
        "bin1@email.com",
        "password1"
      ],
      "line": 13,
      "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword;verify-login-functionality-with-invalid-credentials-using-examples;;2"
    },
    {
      "cells": [
        "bin22@jewelry.com",
        "password2"
      ],
      "line": 14,
      "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword;verify-login-functionality-with-invalid-credentials-using-examples;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Verify Login functionality with invalid credentials using Examples",
  "description": "",
  "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword;verify-login-functionality-with-invalid-credentials-using-examples;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens binup-jewelry application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"bin1@email.com\" and \"password1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "invalid account message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.customerOpensBinupJewelryApplication()"
});
formatter.result({
  "duration": 1565587637,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.i_see_and_click_sign_in_link()"
});
formatter.result({
  "duration": 109490720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bin1@email.com",
      "offset": 13
    },
    {
      "val": "password1",
      "offset": 34
    }
  ],
  "location": "UnsuccessfulLoginSteps.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 442632092,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 90089,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.invalidAccountMessageIsDisplayed()"
});
formatter.result({
  "duration": 1828844204,
  "status": "passed"
});
formatter.after({
  "duration": 107747677,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Login functionality with invalid credentials using Examples",
  "description": "",
  "id": "invalid-login-feature-using-scenario-outline-and-examples-keyword;verify-login-functionality-with-invalid-credentials-using-examples;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens binup-jewelry application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"bin22@jewelry.com\" and \"password2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "invalid account message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.customerOpensBinupJewelryApplication()"
});
formatter.result({
  "duration": 1420647053,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.i_see_and_click_sign_in_link()"
});
formatter.result({
  "duration": 131912518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bin22@jewelry.com",
      "offset": 13
    },
    {
      "val": "password2",
      "offset": 37
    }
  ],
  "location": "UnsuccessfulLoginSteps.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 377994662,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 46755,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulLoginSteps.invalidAccountMessageIsDisplayed()"
});
formatter.result({
  "duration": 2382113649,
  "status": "passed"
});
formatter.after({
  "duration": 111855831,
  "status": "passed"
});
});