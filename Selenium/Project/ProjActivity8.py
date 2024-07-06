# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

#1. Verify the website title
#Goal: Read the title of the website and verify the text
# Set up the Firefox Driver with WebDriverManger

service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs/wp-admin")
    # Find the username field
    username = driver.find_element(By.XPATH, "//*[@id=\"user_login\"]")
    # Find the password field
    password = driver.find_element(By.XPATH, "//*[@id=\"user_pass\"]")
	# Enter the given credentials
    # Enter username
    username.send_keys("root")
    # Enter password
    password.send_keys("pa$$w0rd")
	# Find the login button
    login = driver.find_element(By.XPATH, "//*[@id=\"wp-submit\"]")
    login.click()
	
    Title = driver.title
    print("Page title is: ", Title)
    assert 'Dashboard ‹ Alchemy Jobs — WordPress' in Title
    print('Assertion Test pass')

    driver.quit()