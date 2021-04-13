Feature: Logout to ZeeCMS



  Scenario: Log out
    Given Launch Url "https://qa-zee5cms.kelltontech.net/login"
    Then User Click on "click_adfs"
    Then User Enter text "jaipal@ad.kelltontech.net" in "enter_email" field
    Then User Enter text "Jupiter@123" in "enter_pass" field
    Then User Click on "click_submit"
    Then User Click on "click_profile"
    Then User Click on "click_logout"
