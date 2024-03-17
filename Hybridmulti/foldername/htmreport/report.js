$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Login.feature");
formatter.feature({
  "name": "validate the facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login into facebook application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": ": user is on facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.org.impliment.Imple.user_is_on_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": user enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.org.impliment.Imple.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.org.impliment.Imple.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});