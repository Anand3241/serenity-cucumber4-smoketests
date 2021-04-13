Feature: Login to ZeeCMS



  Scenario: Login to ZEEcms
    Given I launch Url "http://qa-zee5cms.kelltontech.net/"
    Given Invoke Function "LoginAction.login" having parameters "jaipal@ad.kelltontech.net" and "Jupiter@123"

