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
    jobListings = driver.find_element(By.XPATH, "/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]")
    jobListings.click()
    #Locate the “Add New” button and click it.
    addNew = driver.find_element(By.LINK_TEXT, "Add New")
    addNew.click()
    #Fill in the necessary details
    position = driver.find_element(By.ID, "post-title-0")
    position.send_keys("Assistant1")
    company = driver.find_element(By.ID, "_company_name")
    company.send_keys("IBM")
    #Publish
    publish = driver.find_element(By.XPATH, "/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")
    publish.click()
    publish1 = driver.find_element(By.CSS_SELECTOR, ".editor-post-publish-button")
    publish1.click()
    #View Job
    driver.get("https://alchemy.hguy.co/jobs/wp-admin")
    #Locate the left hand menu and click the menu item that says “Job Listings”.
    jobListings1 = driver.find_element(By.XPATH, "/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]")
    jobListings1.click()
    

    driver.quit()