Feature: Adactin Hotel Page


Scenario Outline: Verifying Adactin WebPage and booking a Room
Given User is on Adactin page
When User Should enter "<userName>" and "<passWord>"
And Should click the login button
And Select "<location>","<Hotels>","<RoomType>","<NumberofRooms>", "<CheckInDate>", "<CheckOutDate>", "<AdultsperRoom>", "<ChildrenperRoom>"
And Click Search
And Click on radio button
And Click on Continue button
And Provide"<FirstName>", "<LastName>", "<BillingAddress>", "<CreditCardNo>", Select "<Crcardtype>", "<ExpiryDate>", "<ExpiryYear>", provide "<CvvNo>"
Then Click Book Now button

Examples: 
|userName|passWord|location|Hotels|RoomType|NumberofRooms|CheckInDate|CheckOutDate|AdultsperRoom|ChildrenperRoom|FirstName|LastName|BillingAddress|CreditCardNo|Crcardtype|ExpiryDate|ExpiryYear|CvvNo|
|Cksujith|Ck@1234|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|