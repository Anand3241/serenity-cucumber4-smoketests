Feature: Login to ZeeCMS



#  Scenario: Login to ZEEcms Application
#    Given Launch Url "TestURL"
#    Then User Invoke Function "Login"
#    |jaipal@ad.kelltontech.net|Jupiter@123|
#    Then User verify the page title "OTT CMS"
#    Then User click on "xpath" with value "//*[text()='Cast Profile Management']"
#
#  Scenario: Login to ZEEcms Application2
#    Given Launch Url "TestURL"
#    Then User Click on "click_adfs"
#    Then User Enter text "jaipal@ad.kelltontech.net" in "enter_email" field
#    Then User Enter text "Jupiter@123" in "enter_pass" field
#    Then User Click on "click_submit"
#    Then User verify the page title "OTT CMS"
#    Then User click on "xpath" with value "//*[text()='Cast Profile Management']"
    
  Scenario: Login to ZEEcms Application3
    Given Launch Url "https://qa-zee5cms.kelltontech.net/login"
    Then User Click on "click_adfs"
    Then User Enter text "jaipal@ad.kelltontech.net" in "enter_email" field
    Then User Enter text "Jupiter@123" in "enter_pass" field
    Then User Click on "click_submit"