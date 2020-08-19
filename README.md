# MY FINAL PROJECT in 

## AUTOMATION TESTING

This project was created to show the knowledge I acquired during the 
"full stack Automation" course I just finished.   

This Project was written in Java, using the following frameworks: 
* Selenium for Automation with WebDriverManager 
* TestNg for testing  
* Appuim Studio For mobile testing

My project supports testing on different platforms - web, mobile, Api, Electron And Desktop apps which u can test individually using Jenkins.  
Reports are sent to Allure Reports.

### These are the Tests I created for each Platform:

#####1. Web  
###### test -> SanityTest -> WebProjectTest
1. Register to nopComerce.com using credentials from .xml file
and verify registration.
2. Go to "Digital downloads" page, Choose song called "if you wait" and push a donation.
Then add to cart and verify item was added.
3. Go to shopping cart, Check out using billing info from .xml file
and confirm payment completed.
4. Take picture of logo and compare to original logo saved in file directory.

 ##### test -> ErrorHandlingTest -> WebEHTest
 1. In "Digital Dowloads" page, try making donation with amount under boundary value
 2. In "Digital Dowloads" page, try making donation with amount higher than boundary value
 3. Checkout from shopping cart page, w/out checking the radio button 
 near 'accept terms and conditions', then get the text from allert window and compare to text
 from .xml file 
