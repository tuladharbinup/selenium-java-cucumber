Feature: Search a product using DataTable
  Verifying if the search functionality works

  Scenario: Customer searches for a ring
    Given Customer is in binup-jewelry application
    When I enter the following product name in the search box and click search
      | ProductCode | ProductName |
      | BIN72034 | PANDORA Silver Pink Enamel Rose Ring 190905EN40 |
    Then I see search result number
    And I am able to click the product DETAILS buttton

  Scenario: Customer searches for two rings and add both of them to a cart
    Given Customer is in binup-jewelry application
    When I search the following products and add them to a cart
      | ProductCode | ProductName |
      | BIN72034 | PANDORA Silver Pink Enamel Rose Ring 190905EN40 |
      | BIN9210 | Hot Diamonds Just Add Love Silver Earrings DE110 |

    Then I see added item number in the cart
