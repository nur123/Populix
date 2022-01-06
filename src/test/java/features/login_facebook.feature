Feature: Login Facebook Feature
  Verify user ketika Login masuk ke aplikasi web populix

  Scenario: Login Facebook as user aktif populix web
    Given user is on homepage
    When user click Facebook Login button
    When user input email facebook
    When user input password facebook
    When user click Log in button
    Then user is on pre-screening page