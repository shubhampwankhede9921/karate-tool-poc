Feature: Create a new user post

  Background:
    * url 'http://localhost:8080'

  Scenario: Post a new user to JSONPlaceholder
    Given path 'api/users'
    And request {"title":"Shubham's Post","body":"This is a sample post created by Shubham.","userId":101,"id":101}
    When method post
    Then status 201
    And match response.title == 'Shubham's Post'
    And match response.body == 'This is a sample post created by Shubham.'
    And match response.userId == 101
