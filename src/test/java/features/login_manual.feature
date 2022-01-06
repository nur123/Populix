Feature: Login Manual Feature
  Verify user ketika Login masuk ke aplikasi web populix

  Scenario: Login Manual as user aktif populix web
    Given user is on homepage login manual
    When user input registered Alamat email
    When user input Password
    When user click log in Masuk Manual button
    Then user is on pre-screening page login manual