# Today's agenda:
    - Exception Handling
    - Extent Report
    - Extent Report with POM
    - Explicit Wait

# Exception:
    - Abnormal behaviour which stops the program execution

Excpetions:
   - Compile Time Exceptions or Checked Exceptions
   - RunTime Exception or Unchecked Exceptions
      - NullPointerException
      - NoSuchElementException
      - ArrayOutOfBoundsException
      - NoSuchWindowException
      - StaleElementReferenceException
      - ElementNotInteractableException
      - NoAlertPresentException
      - UnhandledAlertException


# Exception Handling:
   - Apply try / catch block
   - catch block will be exceuted only when there is an exception
   - we cannot have try block alone
   - we cannot have catch block alone
   - All the Exceptions are classes
   - Exception is the super class for all the Exceptions
   - Finally block will be getting executed irrespective of the exceptions
   - To handle exceptions catch block is mandatory
   - try block should be followed by either catch block / finally / catch & finally

   try       try        try
   catch     catch          try
             catch          catch
             catch     catch
                       catch

# Extent Report:

     - Use aventstack library
         <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
</dependency>

    Advantages:
      - Can attach Screenshot for each step
      - Can have report based on different author 
      - Can have report based on different category
      - Consolidated Dashboard with graphs

Extent Classes:
  - ExtentHTMLReporter
  - ExtentReport
  - ExtentTest
  - MediaEntityBuilder


Steps to integrate ExtentReport:
   1. Create startReport() in the BaseClass and declare the ExtentReport extent as a global variable
        - Add all the common lines of code (Step 1 - Step 3)
        - Annotate startReport() with @BeforeSuite
   2. Create stopReport() in the BaseClass and have the code 
         - extent.flush();    
         - Annotate with @AfterSuite
   3. Create testCaseDetails() in the BAseClass and have the lines of code to create testcase and assign the details
         - Annotate this method with @BeforeClass
         - Replace all the hardcoded datas with some global variables
         - Declare some global variables as 
            public String testName, testDescription,testAuthor, testCategory;
   4. Assign all the value inside setValues() in each testcase
   5.                


# throw and throws keyword:
   - throw is used to throw an exception at a specific point in a code
   - throws is used to declare that a method acn throw certain exceptions, allowing the calling 
     method to handle them appropriately

@BeforeSuite            -------------> startReport()  

    @BeforeTest         -------------> setValues()

       @BeforeClass      ------------> testCaseDetails()  

          @DataProvider  ------------> sendData()   

             @BeforeMethod  ---------> preCondition() 

                @Test      ----------> runLogin() , runCreateLead()

             @AfterMethod  ----------> postCondition()

       @AfterClass       ------------> Nil

    @AfterTest          -------------> NIL

@AfterSuite             -------------> NIL                    
      

                              
       