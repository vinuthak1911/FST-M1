# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

#1. Verify the website title
#Goal: Read the title of the website and verify the text
# Set up the Firefox Driver with WebDriverManger

service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs/")

    # Print the title of the page
    Title = driver.title
    print("Page title is: ", Title)

    assert 'Alchemy Jobs – Job Board Application' in Title
    print('Assertion Test pass')

    driver.quit()