Feature: Adactin Portal

Scenario Outline: Verifying the Adactin Page, Booking a Room

Given Adacting Page
When Login with Credentials
|Cksujith|Ck@1234|
And Searching Hotel "<location>","<Hotels>","<RoomType>","<NumberofRooms>", "<CheckInDate>", "<CheckOutDate>", "<AdultsperRoom>","<ChildrenperRoom>"
And Provide"<FirstName>","<LastName>", "<BillingAddress>", "<CreditCardNo>","<CreditCardType>","<ExpiryDate>", "<ExpiryYear>", "<CvvNo>"
Then Verify the Order id is printed on Console



Examples:
|Location|Hotels|RoomType|NumberofRooms|CheckInDate|CheckOutDate|AdultsperRoom|ChildrenperRoom|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpiryDate|ExpiryYear|CvvNo|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Melbourne|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Brisbane|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Adelaide|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|London|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|New York|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Los Angeles|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Paris|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|
|Sydney|Hotel Sunshine|Standard|3 - Three|22/02/2021|23/02/2021|2 - Two|1 - One|Chellappa|C|Chennai|1234567890123456|American Express|January|2021|123|

