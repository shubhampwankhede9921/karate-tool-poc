Feature: Test API Response

  Scenario: Validate API response for a specific user
    Given url 'http://localhost:8080/api/users/2'
    When method GET
    Then status 200
    And match response ==
    """
    {
      "userId": 1,
      "id": 2,
      "title": "qui est esse",
      "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
    }
    """

  Scenario: Validate API response for another specific user
    Given url 'http://localhost:8080/api/users/1'
    When method GET
    Then status 200
    And match response ==
    """
    {
      "userId": 1,
      "id": 1,
      "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
      "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
    }
    """
