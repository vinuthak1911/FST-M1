# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

#Verify the website’s second heading
#Goal: Read the second heading of the website and verify the text

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs/")
	#Find the navigation bar.Select the menu item that says “Jobs” and click it.
    menuItem = driver.find_element(By.LINK_TEXT, "Jobs")
    menuItem.click()

	#Read the page title and verify that you are on the correct page
    Title = driver.title
    print("Page title is: ", Title)

    assert 'Jobs – Alchemy Jobs' in Title
    print('Assertion Test pass')

    #Close
    driver.quit()

