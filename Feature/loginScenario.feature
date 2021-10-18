Feature: login 


Scenario Outline: Users can able to log in with valid credential


Given Users can able to open  url 
And Users can able to typce url "https://www.zoopla.co.uk/"
When Users can able   to click on sign In
And Users can able to enter users name "shumisaif@yahoo.com"
And Users can able to enter Password "sweethome2000"
Then Users can able to verify the page title
And User can close the broswser



Examples: 
|    username           |    password          |   url                         |
|    shumisaif@yahoo.com|   sweethome2000      |   https://www.zoopla.co.uk    |
|    shumisai@yahoo.com |   sweethome2000      |   https://www.zoopla.co.uk    |
|  shumisaif@yahoo.com    |    sweethom200           |https://www.zoopla.co.uk       |




