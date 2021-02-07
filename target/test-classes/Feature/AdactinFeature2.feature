Feature: Adactin Portal

Scenario Outline: Verifying the Adactin Page, Booking a Room

Given Adacting Page
When Login with Credentials "<userName>" "<passWord>" "<login>"
And Searching Hotel "<location>","<Hotels>","<RoomType>","<NumberofRooms>", "<CheckInDate>", "<CheckOutDate>", "<AdultsperRoom>","<ChildrenperRoom>"
Then Provide"<FirstName>","<LastName>", "<BillingAddress>", "<CreditCardNo>","<CreditCardType	>", "<ExpiryDate>", "<ExpiryYear>", "<CvvNo>"

Examples:
|Location|Hotels|RoomType|NumberofRooms|CheckInDate|CheckOutDate|AdultsperRoom|ChildrenperRoom|FirstName|LastName|BillingAddress|CreditCardNo||||||||||||||
