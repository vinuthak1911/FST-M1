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

    header = driver.find_element(By.XPATH, "//h2[text()='Quia quis non']")
    print("Page Header is: ", header)

    assert 'Quia quis non' in header
    print('Assertion Test pass')

    #Close
    driver.quit()


