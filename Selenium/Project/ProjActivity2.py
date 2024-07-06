# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

#Verify the website heading
#Goal: Read the heading of the website and verify the text

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs/")

    header = driver.find_element(By.CSS_SELECTOR, ".entry-title")
    print("Page Header is: ", header)

    assert 'Welcome to Alchemy Jobs' in header
    print('Assertion Test pass')

    driver.quit()