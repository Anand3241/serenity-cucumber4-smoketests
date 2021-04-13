Feature: Logout to ZeeCMS



  Scenario: Log out
    Given I launch Url "http://qa-zee5cms.kelltontech.net/"
    Given Invoke Function "LoginAction.login" having parameters "jaipal@ad.kelltontech.net" and "Jupiter@123"
    When Find "LogOutAction.logOutBtn" Action "click"
    Then I should not see "LoginAction.loginBtn"
    Then User closes the browser