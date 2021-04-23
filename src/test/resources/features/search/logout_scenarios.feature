Feature: Logout to ZeeCMS



  Scenario: Log out
    #Given Launch Url "https://qa-zee5cms.kelltontech.net/login"
    #Then User Click on "click_adfs"
    Given Launch Url Application "TestURL"
    When User click on button "Login with ADFS"
    Then User Enter text "username" in "enter_email" field
    Then User Enter text "password" in "enter_pass" field
    Then User click on button "Sign in"
    Then User Click on "click_profile"
    Then User click on button "Logout"
