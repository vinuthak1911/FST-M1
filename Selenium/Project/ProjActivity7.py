# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs/")
    #Locate the navigation menu and click the menu item that says “Post a Job”
    menuItem = driver.find_element (By.LINK_TEXT, "Post a Job")
    menuItem.click()
	#Fill in the necessary details and click the button that says “Preview”.
    email = driver.find_element(By.ID, "create_account_email")
    email.send_keys("fstmod4@gmail.com")
    jobTitle = driver.find_element(By.ID, "job_title")
    jobTitle.send_keys("Assistant")
    frame = driver.find_element (By.ID, "job_description_ifr")
    driver.switch_to.frame(frame)
    frame.send_keys("hhhh")
    driver.switch_to.default_content()
    applicationEmail = driver.find_element(By.ID, "application")
    applicationEmail.send_keys("ibm@example.com")
    companyName = driver.find_element(By.ID, "company_name")
    companyName.send_keys("IBM")
    preview = driver.find_element(By.XPATH, "//input[@class = 'button']")
    preview.click()
    #Click on the button that says “Submit Listing”.
    driver.find_element(By.XPATH, "//input[@id = 'job_preview_submit_button']").click()
    #Find the navigation bar.Select the menu item that says “Jobs” and click it.
    menuItem1 = driver.find_element(By.LINK_TEXT, "Jobs")
    menuItem1.click()
    #Search for a particular job and wait for listings to show.
    search = driver.find_element(By.ID, "search_keywords")
    search.send_keys("Assistant")
    searchSubmit = driver.find_element(By.XPATH, "/html/body/div[2]/div/div/div/main/article/div/div/form/div[1]/div[4]/input")
    searchSubmit.click()
    print("Test Complete")
    #Close
    driver.quit()

