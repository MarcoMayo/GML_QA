# new feature
# Tags: optional

Feature: Login Gmail

  Scenario Outline: Login Successfully
    Given the user is on the main page
    When he fills in the "<username>" and "<password>"
    Then he can see the inbox of "<username>"

    Examples:
      | username           | password         |
      | testgmlq@gmail.com | contrasena123456 |

  Scenario Outline: Login error password
    Given the user is on the main page
    When he fills in the "<username>" and "<password>"
    Then he can see the "<message>" error

    Examples:
      | username           | password | message |
      | testgmlq@gmail.com | xxxxxxx  | Contraseña incorrecta.  |
      | testgmlq@gmail.com |          | Introduce una contraseña     |