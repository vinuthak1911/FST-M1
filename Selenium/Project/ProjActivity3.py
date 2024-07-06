
# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

#Get the url of the header image
#Goal: Print the url of the header image to the console

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs/")

    # identify image
    image = driver.find_element(By.XPATH,"/html/body/div/div/div/div/main/article/header/div/img")
    #getAttribute() to get src of image
    print("Src attribute is: "+ image.get_attribute("src"))
    #Close
    driver.quit()
