
Feature: Login to ZeeCMS


  Scenario: Login to ZEEcms Application3
    #Given Launch Url "https://qa-zee5cms.kelltontech.net/login"
    #Given Launch Url "<Url>"
    Given Launch Url Application "TestURL"
    When User click on button "Login with ADFS"
    Then User Enter text "username" in "enter_email" field
    Then User Enter text "password" in "enter_pass" field
    Then User click on button "Sign in"
    Then User verify "title" this "Dashboard_title_name"
    Then User verify "link" this "Movie"
    Then User verify "text" this "Dashboard"

#
#
#  Scenario: Log out
#    #Given Launch Url "https://qa-zee5cms.kelltontech.net/login"
#    #Then User Click on "click_adfs"
#    Given Launch Url Application
#    When User click on button "Login with ADFS"
#    Then User Enter text "jaipal@ad.kelltontech.net" in "enter_email" field
#    Then User Enter text "Jupiter@123" in "enter_pass" field
#    Then User click on button "Sign in"
#    Then User Click on "click_profile"
#    Then User click on button "Logout"

#@test
#Feature: All Features
#
#@test1
#  Scenario: Login to Application
#  	Given URL is "TestURL"
#  	Given Test Url "TestURL"
##    Given Launch Url "${TestURL}"
##    When User click on button "Login with ADFS"
##    Given Invoke Function "LoginPage-loginToApplication2" having parameters
##    Given Invoke Function "LoginPageTest-clickADFS"
##	Given URL is "TestURL"
#
#
#@test2
#  Scenario: Login to Application 2
#  Given URL is "TestURL"
#   Given Launch Url "TestURL"
##	When User click on link "cmssupport"
#	When User click on button "Login with ADFS"
##	Then User wait for "10" seconds
#
#
#
##When I click a button "SubmitButton"
##When I click a Link "Submit"
##When I click a xpath "Submit"
##When I input text "Submit"
##Then User verify text "Submit"
##Then User verify window name "Submit"
##Then Iframe "Submit"
##Then i upload file ""
## Read Excel Utility
##Glodal Properties - Browser, Env - QA1,2,3 , Screenshot for failed
##Tagging
    
