$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/navigatingMenu.feature");
formatter.feature({
  "name": "Navigating through the menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Navigate through the menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Vitrakvi Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TC1.i_am_on_Vitrakvi_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on every lnk on the main menu",
  "keyword": "When "
});
formatter.match({
  "location": "TC1.i_click_on_every_lnk_on_the_main_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be directed to the correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "TC1.i_should_be_directed_to_the_correct_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});