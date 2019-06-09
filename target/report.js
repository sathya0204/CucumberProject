$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/AddCustomer1.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user is in Telecom Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_is_in_Telecom_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Click on Add Customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_Click_on_Add_Customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Fill All Details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Sathya"
      ]
    },
    {
      "cells": [
        "LastName",
        "Narayanan"
      ]
    },
    {
      "cells": [
        "EmailID",
        "Sathyanarayanan0204@gmail.com"
      ]
    },
    {
      "cells": [
        "Address",
        "Madipakkam"
      ]
    },
    {
      "cells": [
        "Phon",
        "7418480262"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_Fill_All_Details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The Click a Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_Click_a_Submit_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Get The ID Number",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_Get_The_ID_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Feature/AddTraficPaln2.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The User is In ADD Trafic Plan",
  "keyword": "Given "
});
formatter.step({
  "name": "The User Enter Vaild Plan Details \"\u003cMonthlyRenatal\u003e\",\"\u003cFreeLM\u003e\",\"\u003cFreeInM\u003e\",\"\u003cFreeSMS\u003e\",\"\u003cLocalPer\u003e\",\"\u003cInPerM\u003e\",\"\u003cSMSPer\u003e\",",
  "keyword": "When "
});
formatter.step({
  "name": "The User Click The Submit Button",
  "keyword": "And "
});
formatter.step({
  "name": "The User Should See The Sucess Message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MonthlyRenatal",
        "FreeLM",
        "FreeInM",
        "FreeSMS",
        "LocalPer",
        "InPerM",
        "SMSPer"
      ]
    },
    {
      "cells": [
        "1000",
        "100",
        "100",
        "100",
        "1000",
        "1000",
        "10000"
      ]
    },
    {
      "cells": [
        "2000",
        "200",
        "300",
        "500",
        "2000",
        "5000",
        "70000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The User is In ADD Trafic Plan",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTraficPlan.the_User_is_In_ADD_Trafic_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Enter Vaild Plan Details \"1000\",\"100\",\"100\",\"100\",\"1000\",\"1000\",\"10000\",",
  "keyword": "When "
});
formatter.match({
  "location": "AddTraficPlan.the_User_Enter_Vaild_Plan_Details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Click The Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraficPlan.the_User_Click_The_Submit_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Should See The Sucess Message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraficPlan.the_User_Should_See_The_Sucess_Message()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The User is In ADD Trafic Plan",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTraficPlan.the_User_is_In_ADD_Trafic_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Enter Vaild Plan Details \"2000\",\"200\",\"300\",\"500\",\"2000\",\"5000\",\"70000\",",
  "keyword": "When "
});
formatter.match({
  "location": "AddTraficPlan.the_User_Enter_Vaild_Plan_Details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Click The Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraficPlan.the_User_Click_The_Submit_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User Should See The Sucess Message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraficPlan.the_User_Should_See_The_Sucess_Message()"
});
formatter.result({
  "status": "skipped"
});
});