$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addnewaddress.feature");
formatter.feature({
  "line": 2,
  "name": "Add New Address",
  "description": "",
  "id": "add-new-address",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Address-New"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Add below new address",
  "description": "",
  "id": "add-new-address;add-below-new-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I select address book link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add new address  \"\u003ctitle\u003e\", \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", \"\u003chouseNo\u003e\", \"\u003cpostCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see add new address confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "add-new-address;add-below-new-address;",
  "rows": [
    {
      "cells": [
        "title",
        "firstName",
        "lastName",
        "houseNo",
        "postCode"
      ],
      "line": 11,
      "id": "add-new-address;add-below-new-address;;1"
    },
    {
      "cells": [
        "Mr",
        "Chris",
        "White",
        "24A",
        "EN6 3BA"
      ],
      "line": 12,
      "id": "add-new-address;add-below-new-address;;2"
    },
    {
      "cells": [
        "Dr.",
        "Tom",
        "Gbara",
        "24B",
        "EN6 3BA"
      ],
      "line": 13,
      "id": "add-new-address;add-below-new-address;;3"
    },
    {
      "cells": [
        "Mrs",
        "Mandy",
        "Lan",
        "25A",
        "EN6 3BA"
      ],
      "line": 14,
      "id": "add-new-address;add-below-new-address;;4"
    },
    {
      "cells": [
        "Miss",
        "Flora",
        "Gilbart",
        "26A",
        "EN6 3BA"
      ],
      "line": 15,
      "id": "add-new-address;add-below-new-address;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Add below new address",
  "description": "",
  "id": "add-new-address;add-below-new-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Address-New"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I select address book link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add new address  \"Mr\", \"Chris\", \"White\", \"24A\", \"EN6 3BA\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see add new address confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_select_address_book_link()"
});
formatter.result({
  "duration": 284358913,
  "error_message": "java.lang.NullPointerException\r\n\tat com.pages.LoginPage.goToLoginPageAndVarify(LoginPage.java:19)\r\n\tat com.stepdefination.AddNewAddressPageStepDef.i_select_address_book_link(AddNewAddressPageStepDef.java:14)\r\n\tat ✽.Given I select address book link(addnewaddress.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 20
    },
    {
      "val": "Chris",
      "offset": 26
    },
    {
      "val": "White",
      "offset": 35
    },
    {
      "val": "24A",
      "offset": 44
    },
    {
      "val": "EN6 3BA",
      "offset": 51
    }
  ],
  "location": "AddNewAddressPageStepDef.i_add_new_address(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_should_see_add_new_address_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Add below new address",
  "description": "",
  "id": "add-new-address;add-below-new-address;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Address-New"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I select address book link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add new address  \"Dr.\", \"Tom\", \"Gbara\", \"24B\", \"EN6 3BA\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see add new address confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_select_address_book_link()"
});
formatter.result({
  "duration": 346676,
  "error_message": "java.lang.NullPointerException\r\n\tat com.pages.LoginPage.goToLoginPageAndVarify(LoginPage.java:19)\r\n\tat com.stepdefination.AddNewAddressPageStepDef.i_select_address_book_link(AddNewAddressPageStepDef.java:14)\r\n\tat ✽.Given I select address book link(addnewaddress.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dr.",
      "offset": 20
    },
    {
      "val": "Tom",
      "offset": 27
    },
    {
      "val": "Gbara",
      "offset": 34
    },
    {
      "val": "24B",
      "offset": 43
    },
    {
      "val": "EN6 3BA",
      "offset": 50
    }
  ],
  "location": "AddNewAddressPageStepDef.i_add_new_address(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_should_see_add_new_address_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Add below new address",
  "description": "",
  "id": "add-new-address;add-below-new-address;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Address-New"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I select address book link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add new address  \"Mrs\", \"Mandy\", \"Lan\", \"25A\", \"EN6 3BA\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see add new address confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_select_address_book_link()"
});
formatter.result({
  "duration": 643557,
  "error_message": "java.lang.NullPointerException\r\n\tat com.pages.LoginPage.goToLoginPageAndVarify(LoginPage.java:19)\r\n\tat com.stepdefination.AddNewAddressPageStepDef.i_select_address_book_link(AddNewAddressPageStepDef.java:14)\r\n\tat ✽.Given I select address book link(addnewaddress.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mrs",
      "offset": 20
    },
    {
      "val": "Mandy",
      "offset": 27
    },
    {
      "val": "Lan",
      "offset": 36
    },
    {
      "val": "25A",
      "offset": 43
    },
    {
      "val": "EN6 3BA",
      "offset": 50
    }
  ],
  "location": "AddNewAddressPageStepDef.i_add_new_address(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_should_see_add_new_address_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Add below new address",
  "description": "",
  "id": "add-new-address;add-below-new-address;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Address-New"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I select address book link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add new address  \"Miss\", \"Flora\", \"Gilbart\", \"26A\", \"EN6 3BA\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see add new address confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_select_address_book_link()"
});
formatter.result({
  "duration": 311705,
  "error_message": "java.lang.NullPointerException\r\n\tat com.pages.LoginPage.goToLoginPageAndVarify(LoginPage.java:19)\r\n\tat com.stepdefination.AddNewAddressPageStepDef.i_select_address_book_link(AddNewAddressPageStepDef.java:14)\r\n\tat ✽.Given I select address book link(addnewaddress.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Miss",
      "offset": 20
    },
    {
      "val": "Flora",
      "offset": 28
    },
    {
      "val": "Gilbart",
      "offset": 37
    },
    {
      "val": "26A",
      "offset": 48
    },
    {
      "val": "EN6 3BA",
      "offset": 55
    }
  ],
  "location": "AddNewAddressPageStepDef.i_add_new_address(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewAddressPageStepDef.i_should_see_add_new_address_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
});