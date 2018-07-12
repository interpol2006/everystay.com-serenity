Feature: Login to owner panel

  Background: : Login system with valid data
    Given owner is on home page
    When owner input email as "tri.nguyen+invoice5@everystay.com"
    And owner input password as "123456"
    And owner click button 'Login'
    Then owner will be redirected to home page

    @Step1
    Scenario: Owner input full data to create step 1
      Given owner is on 'Name and Location' page
      When owner input all valid data like
        | fields | values |
      | Property Name | TestHouse|
      | Country| Germany |
      | City | Berlin |
      | House Number | 23 |
      | Address line 1| Brandenburg |
      | Search places| Berlin |
      | Region | Berlin |
      | Sub Region | Berlin |
      #And owner click button 'Save and Continue'
      #Then owner will be navigated to 'Property type and amenities' page

      #@Step2
      #Scenario: Owner input full data to create step 2
        #Given owner is on 'Property type and amenities' page
        #When owner input all valid data like
          #| Fields | Values |
      #| House type | House |
      #| Number of Adults | 2 |
      #| Number of children | 2 |
      #| Property size | 50 |
      #| Number of bedrooms | 2 |
        #| Amenities         |  1,2,3 |
        #And owner click button 'Save and Continue'
        #Then owner will be navigated to 'Description' page

